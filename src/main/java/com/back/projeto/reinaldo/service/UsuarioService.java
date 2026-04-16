/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.projeto.reinaldo.service;

import com.back.projeto.reinaldo.model.Usuario;
import com.back.projeto.reinaldo.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gabriel Ribeiro
 */
@Service
public class UsuarioService {
    
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }
    
    public Optional<Usuario> getUsuario(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario editarUsuario(Usuario pessoa){
        return usuarioRepository.save(pessoa);
    }
    
    public void deleteUsuario(Long id){
        usuarioRepository.deleteById(id);
    }

}
