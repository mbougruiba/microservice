package com.exemple.gestion.Bookstore.gatewayapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;


@SpringBootApplication
@EnableEurekaClient
public class GatewayApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(GatewayApiApplication.class, args);
	}


}
