package com.swacorp.codefatherbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CodefatherBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodefatherBackendApplication.class, args);
    }


    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/lambda")
                        .uri("https://wg7hulc66yd4fpfn6sdytnr7p40wqjrv.lambda-url.us-east-1.on.aws/"))
                .build();
    }
}
