package com.curso.service;

import java.util.List;

import com.curso.dto.CursoDTO;
import com.curso.model.Formacion;

public interface FormacionesService {
	List<Formacion> addFormacion(Formacion ejemplar);
	List<Formacion> getFormaciones();
}
