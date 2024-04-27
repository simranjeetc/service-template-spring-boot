package com.example.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ProductConfiguration
{

	@Bean
	public RestTemplate customRestTemplate() {
		System.out.println("custom rest template");
		RestTemplate restTemplate = new RestTemplate();
		// Additional custom configurations for RestTemplate
		restTemplate.getInterceptors().add(new CustomClientHttpRequestInterceptor());

		return restTemplate;
	}
}
