package com.lecuong.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author CuongLM
 * @created 30/06/2024 - 20:43
 * @project microservice-keycloak-v2
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/user/**")
                        .uri("lb://USER-SERVICE"))
                .route(p -> p
                        .path("/department/**")
                        .uri("lb://DEPARTMENT-SERVICE"))
                .build();
    }
}
