package com.andyloor.uisrael.msa.microservicios_pedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviciosPedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosPedidosApplication.class, args);
	}

}
