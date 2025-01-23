package com.developer.accounts;

import com.developer.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value={AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice",
				version = "v1",
				description = "NVR Bank Accounts Microservice",
				contact = @Contact(name = "Nandivardhan Reddy",
						email = "nandivardhanreddy@nvr.com",
						url = "https://github.com/nandivardhanreddy"
				),
				license = @License(
				name = "Apache 2.0",
				url = "https://www.apache.org/licenses/LICENSE-2.0"
				)
		),
		externalDocs = @io.swagger.v3.oas.annotations.ExternalDocumentation(
				description = "Accounts Microservice REST API Documentation",
				url = "https://github.com/nandivardhanreddy"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
