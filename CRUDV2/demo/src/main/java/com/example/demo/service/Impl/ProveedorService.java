package com.example.demo.service.Impl;

import java.util.List;
import com.example.demo.entity.Proveedor;

public interface ProveedorService {
	
	public List<Proveedor> ListarTodos();
	public void grabar(Proveedor proveedor);
	public Proveedor buscarPorId(Long id);
	public void eliminar(Long id);	

}
