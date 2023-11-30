package com.curso.productos.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.curso.productos.dao.ProductosDAO;
import com.curso.productos.model.Producto;

@Service
public class ProductosServiceImpl implements ProductosService {
    @Autowired
    ProductosDAO dao;

    @Override
    public List<Producto> getProductos() {
        try {
            return dao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList(); 
        }
    }

    @Override
    public Producto getProducto(int codigoProducto) {
        try {
            return dao.findById(codigoProducto).orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Producto> addProductos(Producto producto) {
        try {
            dao.save(producto);
            return getProductos();
        } catch (DataIntegrityViolationException e) {
        	//Si hay Duplicated Primary Key
            e.printStackTrace();
            return getProductos(); 
        }
        catch (Exception e) {
            e.printStackTrace();
            return getProductos(); 
        }
    }

    @Override
    public List<Producto> updProductos(Producto producto) {
        try {
            // Verifica si el producto existe
            if (dao.existsById(producto.getCodigoProducto())) {
                dao.save(producto);
                return getProductos();
            } else {
                return getProductos(); 
            }
        } catch (Exception e) {
            e.printStackTrace();
            return getProductos(); 
        }
    }

	@Override
	public List<Producto> updProductos(int codigoProducto, int unidades, boolean operation) {
		try {
			//obtener el producto a actualizar 
            Producto producto = getProducto(codigoProducto);
            //si el producto existe
            if (producto != null) {
            	//incrementa las unidades de stock
            	//if operation true = restock
            	//if operation true = venda
            	producto.setStock((operation ? producto.getStock()+unidades : producto.getStock()-unidades) );
                dao.save(producto);
                return getProductos();
            } else {
                return getProductos(); 
            }
        } catch (Exception e) {
            e.printStackTrace();
            return getProductos(); 
        }
	}

	@Override
	public double getProductoPrice(int codigoProducto) {
		 try {
	            Producto producto = dao.findById(codigoProducto).orElse(null);
	            return (producto != null) ? producto.getPrecioUnitaro() : -1;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return -1;
	        }
	}

	@Override
	public int getProductoStock(int codigoProducto) {
		try {
            Producto producto = dao.findById(codigoProducto).orElse(null);
            return (producto != null) ? producto.getStock() : -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
	}
}

