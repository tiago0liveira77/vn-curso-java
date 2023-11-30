package com.curso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("paginas")
public class SaludoController {

	@GetMapping(value="/saludo")
	public  String mostrarHome() {
		return "saludo";		
}


}
