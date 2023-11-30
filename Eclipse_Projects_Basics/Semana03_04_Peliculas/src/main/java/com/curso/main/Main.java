package com.curso.main;

import java.util.List;

import com.curso.model.CodigoPrecio;
import com.curso.model.Pelicula;
import com.curso.model.TituloDiretor;
import com.curso.services.PeliculaService;

public class Main {
	
	static PeliculaService ps = new PeliculaService();
	
	static Pelicula p1 = new Pelicula("MOV001", "Movie 1", "Director 1", 500);
	
	static void getPeliculas() {
		List<Pelicula> lista = ps.selectPelicula();
		for(Pelicula p: lista) {
			System.out.println(p.toString());
		}
	}
	
	static void getPelicula(String codigo) {
		Pelicula p = ps.selectPelicula(codigo);
		System.out.println(p.toString());
		
	}
	
	static void getPeliculasByAutor(String diretor) {
		List<Pelicula> lista = ps.selectPeliculasByDiretor(diretor);
		for(Pelicula p: lista) {
			System.out.println(p.toString());
		}
	}
	
	static void getPeliculasByDiretorLike(String like) {
		List<Pelicula> lista = ps.selectPeliculasByLike(like);
		for(Pelicula p: lista) {
			System.out.println(p.toString());
		}
	}
	
	static void getPeliculasByDiretores(List<String> diretores) {
		List<Pelicula> lista = ps.selectPeliculasByDiretoresNames(diretores);
		for(Pelicula p: lista) {
			System.out.println(p.toString());
		}
	}
	
	static void getDiretores() {
		List<String> lista = ps.selectDiretores();
		for(String p: lista) {
			System.out.println(p);
		}
	}
	
	static void getPeliculasByPrice(int min, int max) {
		List<Pelicula> lista = ps.selectPeliculasByPrice(min,max);
		for(Pelicula p: lista) {
			System.out.println(p.toString());
		}
	}
	
	static void getTitulosAndDiretores() {
		List<TituloDiretor> lista = ps.selectTituloAndDiretor();
		for(TituloDiretor p: lista) {
			System.out.println(p.toString());
		}
	}
	
	static void getCodigosAndPrecios() {
		List<CodigoPrecio> lista = ps.selectCodigoAndPrecio();
		for(CodigoPrecio p: lista) {
			System.out.println(p.toString());
		}
	}

	public static void main(String[] args) {
		// CRUD BASICO
		// --- INSERTs
		ps.insertPelicula(p1);
		
		// --- DELETEs
		//ps.deletePelicula(p1);
		//ps.deletePelicula("MOV001");
		
		// --- SELECTs
		//getPeliculas(); 
		//getPelicula("MOV004");
		
		// --- UPDATEs
		//Pelicula p1Edited = new Pelicula("MOV001", "Movie 1 Edited", "Director 1 Edited", 400);
		//ps.updatePelicula(p1, p1Edited);
		
		//---------------------------------------------------------------------
		//Mostrar peliculas cuyo director es Cosme:
		//getPeliculasByAutor("Cosme");
		
		//Mostrar las películas en las que el nombre del director empieza por M
		//getPeliculasByDiretorLike("M");
		
		//Mostrar las películas cuyo directora es Ana o Eva
		//List<String> diretores = new ArrayList();
		//diretores.add("Ana");
		//diretores.add("Eva");
		//getPeliculasByDiretores(diretores);
		
		//Mostrar sólo los directores de las películas
		//getDiretores();
		
		//Mostrar las películas cuyo precio es mayor que 20 y menor que 55
		//getPeliculasByPrice(20, 55);
		
		//Nuevas query 1 - Retornar titulo y diretor con nuevo model
		//getTitulosAndDiretores();
		
		//Nuevas query 2 - Retornar codigo e precio con nuevo model
		//getCodigosAndPrecios();
		
	}

}
