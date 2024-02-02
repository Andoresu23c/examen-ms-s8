package com.example.microserviciolaliga;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviciolaligaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciolaligaApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelmapper() {
		return new ModelMapper();
	}

}
