package com.andyloor.uisrael.msa.microservicios_pedidos.controller;

import com.andyloor.uisrael.msa.microservicios_pedidos.entity.PedidosEntity;
import com.andyloor.uisrael.msa.microservicios_pedidos.repository.IPedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/andyloor/pedidos")
public class PedidosController {

    @Autowired
    private IPedidosRepository repoPedidos;
    ///para obtener todos los datos de la colecion
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PedidosEntity> getAllPedidos() {
        return repoPedidos.findAll();
    }

    /////////para crear un nuevo producto
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public PedidosEntity createProduct(@RequestBody PedidosEntity pedidos) {
        return repoPedidos.save(pedidos);
    }
}
