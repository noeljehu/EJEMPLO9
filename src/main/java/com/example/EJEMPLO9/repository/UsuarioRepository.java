package com.example.EJEMPLO9.repository;

import com.example.EJEMPLO9.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
