package com.andyloor.uisrael.msa.microservicios_productos.repository;

import com.andyloor.uisrael.msa.microservicios_productos.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<ProductoEntity, Integer> {
}
