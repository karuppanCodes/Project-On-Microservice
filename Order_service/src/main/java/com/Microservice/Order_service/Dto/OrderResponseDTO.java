package com.Microservice.Order_service.Dto;

import lombok.Data;

@Data
public class OrderResponseDTO {
    private Long orderId;
    private Long productId;
    private Long quantity;

    // productDetails
    private String productName;
    private Double productPrice;
    private Double totalPrice;

    public OrderResponseDTO(Long orderId, Long productId, String productName, Double price, Long quantity) {
    }

    public OrderResponseDTO() {

    }
}
