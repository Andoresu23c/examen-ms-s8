package com.uisrael.gestiontorneos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestiontorneosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestiontorneosApplication.class, args);
	}

}
