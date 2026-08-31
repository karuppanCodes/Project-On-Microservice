package com.Microservice.Order_service.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientBuilder {

    @Bean
    public WebClient webClient(){
           return WebClient.builder().build();
    }
}
