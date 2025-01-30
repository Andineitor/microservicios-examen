package com.andyloor.uisrael.msa.microservicios_productos.controller;


import com.andyloor.uisrael.msa.microservicios_productos.entity.ProductoEntity;
import com.andyloor.uisrael.msa.microservicios_productos.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/andyloor/productos")
public class ProductoController {
    @Autowired
    private IProductoRepository repoProducto;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoEntity> getAllProductos() {
        return repoProducto.findAll();
    }

    /////////para crear un nuevo producto
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductoEntity createPedidos(@RequestBody ProductoEntity pedidos) {
        return repoProducto.save(pedidos);
    }

    // Editar un producto existente
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK) // 200 OK
    public ProductoEntity updatePedidos(@PathVariable Integer id, @RequestBody ProductoEntity updatedPedidos) {
        updatedPedidos.setId(id); // Asegúrate de que el id no cambie
        return repoProducto.save(updatedPedidos);
    }

    // Eliminar un producto
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK) // 204 No Content
    public ResponseEntity<String> deletePedidos(@PathVariable Integer id) {
        repoProducto.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("pedidos elimnado  " + id);
    }
}
