package com.txzq.swagger_ui;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "TXZQ Service API 文档", version = "1.0.0",
                description = "这是一个基于 Spring Boot 3.x 和 Swagger UI 的 API 文档示例", contact = @Contact(
                name = "TXZQ Service Team", email = "service@txzq.com", url = "https://service.txzq.com"),
                termsOfService = "https://www.txzq.com/terms/"

        ))
public class SwaggerUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerUiApplication.class, args);
    }
}