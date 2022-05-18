package com.idat.C.WorkspaceIDAT.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.C.WorkspaceIDAT.model.Productos;


@Repository
public class ProductoRepositoryImpl implements ProductoRepository {
	
	public List<Productos> listar = new ArrayList<Productos>();

	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		listar.add(producto);
		
	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		Productos p = obtenerProductoID(producto.getIdProducto());
		listar.remove(p);
		listar.add(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Productos obtenerProductoID(Integer id) {
		
	//	if(listar != null) {
		// for (Productos productos : listar) {
			// if(productos.getIdProducto() == id)
				// return productos;
		 //}
		//}
		
		//return null;
		
		return listar.stream().filter(p ->p.getIdProducto()== id).findFirst().orElse(null);
	}


}
