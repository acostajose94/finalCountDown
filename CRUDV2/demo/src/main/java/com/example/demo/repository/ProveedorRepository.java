package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Proveedor;

public interface ProveedorRepository
        extends CrudRepository<Proveedor, Long>{

}
