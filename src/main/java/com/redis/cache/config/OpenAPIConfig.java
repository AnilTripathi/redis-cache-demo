package com.redis.cache.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

	@Bean
	OpenAPI myOpenAPI() {
		Contact contact = new Contact();
		contact.setEmail("employee@gmail.com");
		contact.setName("Anil Kumar Tripathi");
		contact.setUrl("https://www.ticketbooking.com");

		License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

		Info info = new Info().title("Employee Management API").version("1.0").contact(contact)
				.description("This API exposes endpoints to Employee.")
				.termsOfService("https://www.employee.com/terms").license(mitLicense);

		return new OpenAPI().info(info);
	}
}
