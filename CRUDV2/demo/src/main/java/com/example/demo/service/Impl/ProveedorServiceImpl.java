package com.example.demo.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Proveedor;
import com.example.demo.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService{
	
	@Autowired
	private ProveedorRepository repository;

	@Override
	public List<Proveedor> ListarTodos() {
		return (List<Proveedor>) repository.findAll();
	}
	

	@Override
	public void grabar(Proveedor proveedor) {
		repository.save(proveedor);
	}

	@Override
	public Proveedor buscarPorId(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		repository.deleteById(id);
	}

}
