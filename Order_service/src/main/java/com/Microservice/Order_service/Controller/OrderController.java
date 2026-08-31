package com.Microservice.Order_service.Controller;

import com.Microservice.Order_service.Dto.OrderResponseDTO;
import com.Microservice.Order_service.Entity.Order;
import com.Microservice.Order_service.Service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    //place Order
    @PostMapping("/placeOrder")
    public Mono<ResponseEntity<OrderResponseDTO>> placeOrder(@RequestBody Order order){
        return orderService.createOrder(order).map(orderResponseDTO ->ResponseEntity.ok(orderResponseDTO));
    }

    //getOrders
    @GetMapping("/getOrders")
    public ResponseEntity<List<Order>> getAllOrders(){
        return ResponseEntity.ok(orderService.getAllOrders());
    }
}
