package com.um.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.um.ecommerce.model.Producto;

public interface ProductoService {
	public Producto save( Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();

}
