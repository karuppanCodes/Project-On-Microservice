package com.Microservice.Order_service.Dto;

import lombok.Data;

@Data
public class ProductResponseDTO {

    private Long productId;
    private String productName;
    private Double price;
}
