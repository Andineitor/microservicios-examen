package com.andyloor.uisrael.msa.microservicios_usuarios.controller;

import com.andyloor.uisrael.msa.microservicios_usuarios.entity.UsuarioEntity;
import com.andyloor.uisrael.msa.microservicios_usuarios.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/andyloor/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioRepository repoUsuario;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioEntity> getAllUsuarios() {
        return repoUsuario.findAll();
    }

    /////////para crear un nuevo producto
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public UsuarioEntity createUsuario(@RequestBody UsuarioEntity usuario) {
        return repoUsuario.save(usuario);
    }

    // Editar un producto existente
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK) // 200 OK
    public UsuarioEntity updateUsuario(@PathVariable String id, @RequestBody UsuarioEntity updatedUsuario) {
        updatedUsuario.setId(id); // Asegúrate de que el id no cambie
        return repoUsuario.save(updatedUsuario);
    }

    // Eliminar un producto
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK) // 204 No Content
    public ResponseEntity<String> deleteUsuario(@PathVariable String id) {
        repoUsuario.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("usuario elimnado  " + id);
    }
}
