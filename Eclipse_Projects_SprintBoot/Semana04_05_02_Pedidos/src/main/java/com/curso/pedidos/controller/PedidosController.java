package com.curso.pedidos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.pedidos.model.Pedido;
import com.curso.pedidos.service.PedidosService;

@RestController
public class PedidosController {
	@Autowired
	PedidosService service;
	
	@GetMapping(value="pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> getPedidos(){
		return service.getPedidos();	
	}
	
	@PostMapping(value="pedidos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> addPedidos(@RequestBody Pedido pedido){
		return service.addPedidos(pedido);
	}
}
