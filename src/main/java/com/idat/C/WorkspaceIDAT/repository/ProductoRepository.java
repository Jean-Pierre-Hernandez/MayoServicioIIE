package com.idat.C.WorkspaceIDAT.repository;

import java.util.List;

import com.idat.C.WorkspaceIDAT.model.Productos;

public interface ProductoRepository {
	
	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductoID(Integer id);

}
