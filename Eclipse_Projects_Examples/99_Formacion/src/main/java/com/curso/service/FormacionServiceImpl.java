package com.curso.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dto.CursoDto;
import com.curso.model.Formacion;

import io.micrometer.common.util.StringUtils;

/**
	 * Clase servicio que implementa los metodos de nuestra interfaz, utilizamos el
	 * CursoDto para mapear el recurso de Curso
	 *
	 * @see com.curso.dto.CursoDTO
	 * @see com.curso.controller.FormacionController
	 * @see com.curso.service.FormacionService
	 */
	@Service
	public class FormacionServiceImpl implements FormacionService {

	    /**
	     * Inyectamos el ResTemplate configurado en la clase de configuracion
	     * Application.java
	     */
	    @Autowired
	    RestTemplate template;

	    private final String URL_MICROSERVICIO_CURSOS = "http://localhost:8080/cursos";

	    /**
	     * Devolvemos la lista en formato del objeto Formacion, mapeandolo a traves de  CursoDto
	     *
	     * @return List<Formacio>
	     */
	    @Override
	    public List<Formacion> getAll() {
	        List<CursoDto> list = Arrays.asList(template.getForObject(URL_MICROSERVICIO_CURSOS, CursoDto[].class));

	        // Mapeamos
	        List<Formacion> listaFormacion = list.stream().map(cursoDto -> {
	            Formacion formacion = new Formacion();
	            formacion.setCurso(cursoDto.getNombre());
	            formacion.setAsignaturas(calculate(cursoDto.getDuracion()));
	            formacion.setPrecio(cursoDto.getPrecio());
	            return formacion;
	        }).collect(Collectors.toList());

	        return listaFormacion;
	    }

	    /**
	     * Guardamos el recurso formacion mapeandolo a traves del CursoDto
	     *
	     * @param formacion
	     * @return List<Formacion>
	     */
	    @Override
	    public List<Formacion> save(Formacion formacion) {
	        if (!isValidFormacion(formacion)) {
	            throw new IllegalArgumentException("No es valida la formacion que has introducido");
	        }
	        int duracion = calculateDuration(formacion.getAsignaturas());

	        CursoDto curso = new CursoDto(formacion.getCurso(), duracion, formacion.getPrecio());

	        template.postForLocation(URL_MICROSERVICIO_CURSOS, curso);

	        return getAll();
	    }

	    /**
	     * Metodo para calcular el numero de asignaturas
	     *
	     * @param duracion
	     * @return int
	     */
	    private int calculate(int duracion) {
	        return (duracion >= 50) ? 10 : 5;
	    }

	    /**
	     * Metodo para calcular la duracion del curso
	     *
	     * @param asignaturas
	     * @return asiganturas
	     */
	    private int calculateDuration(int asignaturas) {
	        return asignaturas * 10;
	    }

	    private boolean isValidFormacion(Formacion formacion) {
	        if (formacion == null) {
	            return false;
	        }

	        if (StringUtils.isBlank(formacion.getCurso())) {
	            return false;
	        }

	        if (formacion.getAsignaturas() <= 0) {
	            return false;
	        }

	        if (formacion.getPrecio() <= 0) {
	            return false;
	        }

	        return true;
	    }

	}
