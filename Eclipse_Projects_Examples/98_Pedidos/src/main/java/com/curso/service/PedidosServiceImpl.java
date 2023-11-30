package com.curso.service;	

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.PedidosDao;
import com.curso.model.Pedido;
@Service
public class PedidosServiceImpl implements PedidosService {
@Autowired
	PedidosDao pedidosDao;
@Autowired 
RestTemplate restTemplate;
private final String URL_MICROSERVICIO_PRODUCTOS = "http://localhost:8080";
	@Override
	public List<Pedido> pedidos() {
		return pedidosDao.findAll();
	}

	@Override
	public void altaPedido(Pedido pedido) {
		pedido.setFechaPedido(LocalDate.now());
		pedido.setTotal(pedido.getUnidades()*obtenerPrecio(pedido.getCodigoProducto()));
		pedidosDao.save(pedido);	
		actualizarStock(pedido.getCodigoProducto(),pedido.getUnidades());
	}
	
	private double obtenerPrecio(int codigoProducto) {
		return Double.parseDouble(restTemplate.getForObject(URL_MICROSERVICIO_PRODUCTOS.concat("/precio/{codigo}"), String.class,codigoProducto));
	}
	//Como ProductosController se enarga de hacer la actualización del stock, solo hago la llamada
	//El segundo parámetro es null porque el cuerpo no manda nada
	private void actualizarStock(int codigoProducto, int unidades) {
		restTemplate.put(URL_MICROSERVICIO_PRODUCTOS.concat("/productos/{codigo}/{unidades}"), null, codigoProducto,unidades);
	}
}
