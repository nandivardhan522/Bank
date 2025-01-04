package com.developer.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.developer.loans.controller") })
@EnableJpaRepositories("com.developer.loans.repository")
@EntityScan("com.developer.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "NVR Bank Loans microservice REST API Documentation",
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
				description = "NVR Bank Loans microservice REST API Documentation",
				url = "http://localhost:8090/swagger-ui/index.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}