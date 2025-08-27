package com.javanauta.cadastro_usuario.infrastructure.repository;

import com.javanauta.cadastro_usuario.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    //Método para retornar por email
    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
