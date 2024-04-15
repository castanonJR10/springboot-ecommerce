package com.um.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.um.ecommerce.model.Usuario;

public interface IUsuarioService {
	List<Usuario> findAll();
	Optional<Usuario> findById(Integer id);
	Usuario save(Usuario usuario);
	Optional<Usuario> findByEmail(String email);
}