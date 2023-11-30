package com.curso.service;

import java.util.List;

import com.curso.model.Pagina;

public class BuscadorService {
	List<Pagina> paginas=List.of(new Pagina("www.fnac.es","libros","Libros y más cosas"),
            new Pagina("www.gamer.es","juegos","Juegos on-line"),
            new Pagina("www.casadellibro.es","libros","La Web de los libros"),
            new Pagina("www.agapea.com","libros","Libros en la libreria online"),
            new Pagina("www.sounddogs.com","música","Efectos de sonido"),
            new Pagina("www.radio.es","música","Música de actualidad"));
	
	public List<Pagina> buscador(String tematica){
		return paginas.stream()
				.filter(x->x.getTematica().equals(tematica))
				.toList();
	}
}
