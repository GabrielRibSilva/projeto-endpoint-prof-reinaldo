/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.projeto.reinaldo.repository;

import com.back.projeto.reinaldo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gabriel Ribeiro
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
