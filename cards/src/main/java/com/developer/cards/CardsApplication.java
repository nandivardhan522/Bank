package com.developer.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "NVR Bank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Nandivardhan Reddy",
						email = "nandivardhanreddy23@gmail.com",
						url = "https://github.com/nandivardhan522/Bank"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/nandivardhan522/Bank"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "NVR Bank Cards microservice REST API Documentation",
				url = "https://www.eazybytes.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}