package com.idat.C.WorkspaceIDAT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.C.WorkspaceIDAT.model.Productos;
import com.idat.C.WorkspaceIDAT.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository repository;

	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
			repository.guardarProducto(producto);
	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		repository.actualizarProducto(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repository.eliminarProducto(id);
	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return repository.listarProductos();
	}

	@Override
	public Productos obtenerProductoID(Integer id) {
		// TODO Auto-generated method stub
		return repository.obtenerProductoID(id);
	}

}
