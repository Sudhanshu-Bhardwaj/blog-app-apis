package com.practice.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {
		
	
	@Bean
	public OpenAPI openAPI() {
		String schemeName = "bearerScheme";
		return new OpenAPI()
				.addSecurityItem(new SecurityRequirement()
						.addList(schemeName)
				)
				.components(new Components()
						.addSecuritySchemes(schemeName, new SecurityScheme()
								.name(schemeName)
								.type(SecurityScheme.Type.HTTP)
								.bearerFormat("JWT")
								.scheme("bearer")
						)
				)
				.info(new Info()
						.title("Blogging Application")
						.description("This is Blogging Application project API developed by Sudhanshu Bhardwaj")
						.version("1.0")
						.contact(new Contact().name("Sudhanshu Bhardwaj").email("sudhanshubhardwaj27@gmail.com").url("sudhanshu.com"))
						.license(new License().name("Apache"))
						
				).externalDocs(new ExternalDocumentation().url("learncodewithsudhanshu.com").description("this is external url"));
	}
}



// Annotations based configuration
/* 
 * @SecurityScheme(
		name = "scheme1",
		type = SecuritySchemeType.HTTP,
		bearerFormat = "JWT",
		scheme = "bearer"
		)
@OpenAPIDefinition(
		info = @Info(
				title = "Blogging Application",
				description ="This is Blogging Application project API developed by Sudhanshu Bhardwaj",
				version = "1.0",
				contact = @Contact(
						name = "Sudhanshu Bhardwaj",
						email ="sudhanshubhardwaj27@gmail.com",
						url = "sudhanshu.com"
						),
				license = @License(
						name = "OPEN License",
						url = "sudhanshu.com"
						)
				),
		externalDocs = @ExternalDocumentation(
				description = "This is external docs",
				url = "sudhanshu.com"
				)
		)
  */
