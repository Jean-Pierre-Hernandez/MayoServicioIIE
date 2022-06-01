package com.idat.mayoservicioiie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.mayoservicioiie.model.Proveedor;
import com.idat.mayoservicioiie.repository.ProveedorRepository;

public class ProveedorServiceImpl implements ProveedorService{
	
	@Autowired
	private ProveedorRepository repository;

	@Override
	public void guardarProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		repository.save(proveedor);
	}

	@Override
	public void actualizarProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(proveedor);
	}

	@Override
	public void eliminarProveedor(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Proveedor> listarProveedor() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Proveedor obtenerProveedorId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}
	

}
