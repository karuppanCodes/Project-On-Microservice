package com.Microservice.Order_service.Service;

import com.Microservice.Order_service.Dto.OrderResponseDTO;
import com.Microservice.Order_service.Dto.ProductResponseDTO;
import com.Microservice.Order_service.Entity.Order;
import com.Microservice.Order_service.Repository.OrderRepo;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class OrderService {

    private final WebClient webClient;
    private final OrderRepo orderRepo;

    public OrderService(WebClient webClient, OrderRepo orderRepo) {
        this.webClient = webClient;
        this.orderRepo = orderRepo;
    }

    // placeOrder
    public Mono<OrderResponseDTO> createOrder(Order order) {

        return webClient
                .get()
                .uri("http://localhost:8081/products/" + order.getProductId())
                .retrieve()
                .bodyToMono(ProductResponseDTO.class)
                .map(productResponseDTO -> {
                    OrderResponseDTO ResponseDTO = new OrderResponseDTO();
                    ResponseDTO.setOrderId(order.getOrderId());
                    ResponseDTO.setProductId(order.getProductId());
                    ResponseDTO.setQuantity(order.getQuantity());

                    //product details
                    ResponseDTO.setProductName(productResponseDTO.getProductName());
                    ResponseDTO.setProductPrice(productResponseDTO.getPrice());
                    ResponseDTO.setTotalPrice(order.getQuantity() * productResponseDTO.getPrice());

                    Order savedORder = orderRepo.save(order);
                    ResponseDTO.setOrderId(savedORder.getOrderId());
                    return ResponseDTO;
                });
    }

    //get All orders
    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }
}