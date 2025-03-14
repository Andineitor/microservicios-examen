package com.andyloor.uisrael.msa.microservicios_usuarios.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="usuario")
@Getter
@Setter
@NoArgsConstructor
public class UsuarioEntity {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;



    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) { // ← Asegúrate de que este método exista
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}



