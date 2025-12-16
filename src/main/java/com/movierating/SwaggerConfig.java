package com.movierating;
	

	import io.swagger.v3.oas.models.OpenAPI;
	import io.swagger.v3.oas.models.info.Info;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;

	@Configuration
	public class SwaggerConfig {

	    @Bean
	    public OpenAPI customOpenAPI() {
	        return new OpenAPI()
	                .info(new Info()
	                        .title("Movie API 🎬")
	                        .version("1.0")
	                        .description("API to manage movies. Add, update, delete, and view movies using Swagger UI."));
	    }
	}


