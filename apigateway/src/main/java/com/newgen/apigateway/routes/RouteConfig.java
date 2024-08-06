package com.newgen.apigateway.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/clients/**")
                        .filters(f -> f
                                .rewritePath("/clients/(?<segment>.*)", "${segment}"))
                        .uri("lb://CLIENTS")
                )
                .build();
    }

}
