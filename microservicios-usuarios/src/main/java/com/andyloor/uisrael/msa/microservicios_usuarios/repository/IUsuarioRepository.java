package com.andyloor.uisrael.msa.microservicios_usuarios.repository;

import com.andyloor.uisrael.msa.microservicios_usuarios.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUsuarioRepository extends MongoRepository<UsuarioEntity, String> {
}
