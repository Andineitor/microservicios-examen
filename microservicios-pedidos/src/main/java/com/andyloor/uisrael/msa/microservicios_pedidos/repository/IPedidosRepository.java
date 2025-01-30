package com.andyloor.uisrael.msa.microservicios_pedidos.repository;

import com.andyloor.uisrael.msa.microservicios_pedidos.entity.PedidosEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPedidosRepository extends MongoRepository<PedidosEntity, String> {
}
