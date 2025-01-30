package com.andyloor.uisrael.msa.microservicios_productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviciosProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosProductosApplication.class, args);
	}

}
