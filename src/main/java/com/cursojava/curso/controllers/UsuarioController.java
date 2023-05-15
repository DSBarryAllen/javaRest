package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Isaac");
        usuario.setApellido("Guevara");
        usuario.setEmail("isaacjgm2015@gmail.com");
        usuario.setTelefono("954125478");
        return usuario;
    }
    @RequestMapping(value = "usuario2567")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Isaac");
        usuario.setApellido("Guevara");
        usuario.setEmail("isaacjgm2015@gmail.com");
        usuario.setTelefono("954125478");
        return usuario;
    }
    @RequestMapping(value = "usuario1123")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Isaac");
        usuario.setApellido("Guevara");
        usuario.setEmail("isaacjgm2015@gmail.com");
        usuario.setTelefono("954125478");
        return usuario;
    }
    @RequestMapping(value = "usuario1000")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Isaac");
        usuario.setApellido("Guevara");
        usuario.setEmail("isaacjgm2015@gmail.com");
        usuario.setTelefono("954125478");
        return usuario;
    }
}
