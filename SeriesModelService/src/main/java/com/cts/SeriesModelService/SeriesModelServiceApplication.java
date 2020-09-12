package com.cts.SeriesModelService;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EntityScan(basePackages = "com.cts.*")
@EnableEurekaClient
public class SeriesModelServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SeriesModelServiceApplication.class, args);

	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.cts")).build().apiInfo(metaData());
	}

	private ApiInfo metaData() {
		ApiInfo apiInfo =new ApiInfo(
				"SeriesModel REST API", 
				"Handling Series and respective models of cars for ABC Corporation",
				"1.0", 
				"Free to use", 
				new springfox.documentation.service.Contact("Emmanuel Kakumanu", "https://github.com", "808209@cognizant.com"),
				"License Free", 
				"https://github.com", 
				Collections.emptyList()); 
		return apiInfo;

	}

	

}
