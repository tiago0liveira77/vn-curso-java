package com.curso.pedidos.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.pedidos.dao.PedidosDAO;
import com.curso.pedidos.model.Pedido;

@Service
public class PedidosServiceImpl implements PedidosService {
	@Autowired
	PedidosDAO dao;
	
	@Autowired
	RestTemplate template;
	
	private String url = "http://localhost:8080/";

	@Override
	public List<Pedido> addPedidos(Pedido pedido) {
		try {
			//obtener lo stock del producto
			int stock = template.getForObject(url + "producto/stock/" + pedido.getCodigoProducto(), Integer.class);
			//Si no hay stock suficiente para el pedido
			if (stock < pedido.getUnidades()) {
				System.out.println("No hay stock suficiente!");
				return getPedidos();
			}
			
			//obtener lo precio del producto
			double precio = template.getForObject(url + "producto/price/" + pedido.getCodigoProducto(), Double.class);
			
			//total del pedido (precio * unidades)
			pedido.setTotal(precio * pedido.getUnidades());
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();   
			
			pedido.setFechaPedido(now);
            
			dao.save(pedido);
            
			//diminuir stock del producto vendido
            template.put(url + "productos/pedidos/" + pedido.getCodigoProducto() + "/" + pedido.getUnidades(), null);
            return getPedidos();
        } catch (DataIntegrityViolationException e) {
        	//Si hay Duplicated Primary Key
            e.printStackTrace();
            return getPedidos();
        }
        catch (Exception e) {
            e.printStackTrace();
            return getPedidos();
        }
	}

	@Override
	public List<Pedido> getPedidos() {
		try {
            return dao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList(); 
        }
	}

}
