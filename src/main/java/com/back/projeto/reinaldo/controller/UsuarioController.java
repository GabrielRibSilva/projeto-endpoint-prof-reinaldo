/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.projeto.reinaldo.controller;

import com.back.projeto.reinaldo.model.Usuario;
import com.back.projeto.reinaldo.service.UsuarioService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gabriel Ribeiro
 */
@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {
    
    private UsuarioService usuarioService;

//    @GetMapping
//    private String usuarioTeste(){
//        return "Hello, this application pass!";
//    }
    
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
//    @GetMapping("/{id}")
//    public Usuario getUsuario(@PathVariable("id") Long id){     
//        return usuarioService.getUsuario(id).orElse(null);
//    }
    
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }
    
    @GetMapping()
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }
    
    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable("id") Long id){     
        return usuarioService.getUsuario(id).orElse(null);
    }
    
    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        return usuarioService.editarUsuario(usuario);
    }
    
    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id){     
        usuarioService.deleteUsuario(id);
    }
}
