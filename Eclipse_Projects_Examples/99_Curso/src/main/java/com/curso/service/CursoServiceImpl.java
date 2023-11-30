package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursoDao;
import com.curso.model.Curso;
/**
 * Clase servicio, dónde implementamos los métodos de la interfaz
 *
 * @see com.sinensia.service.CursoService
 * @see com.sinensia.dao.CursoDao
 */
@Service
public class CursoServiceImpl implements CursoService{
	/**
     * Inyectamos el dao que extiende de JpaRepository para poder acceder a los metodos 
     */
    @Autowired
    CursoDao dao;

    /**
     * @paran curso return List<Curso>
     */
    @Override
    public List<Curso> save(Curso curso) {
        dao.save(curso);
        return dao.findAll();
    }

    /**
     * @param codCurso
     * @retun List<Curso>
     */
    @Override
    public List<Curso> deleteById(int codCurso) {  	
          dao.findById(codCurso).orElse(null);
          dao.deleteById(codCurso);
          return dao.findAll();
    }

    /**
     * @param codCurso
     * @param duracion
     */
    @Override
	public void update(int codCurso, int duracion) {
		Curso curso = dao.findById(codCurso).orElse(null);
		if (curso != null) {
			curso.setDuracion(duracion);
			dao.save(curso);
		}

    }

		
    /**
     * @return List<Curso
     */
    @Override
    public List<Curso> getAll() {
        return dao.findAll();
    }

    /**
     * @param codCurso
     * @return curso
     */
    @Override
    public Curso getById(int codCurso) {
        Curso curso = dao.findById(codCurso).orElse(null);
        return curso;
    }

    /**
     *
     * @param minPrecio
     * @param maxPrecio
     * @return List<Curso>
     */
    @Override
    public List<Curso> findByPrecioBetween(int minPrecio, int maxPrecio) {
          return dao.findByPrecioBetween(minPrecio, maxPrecio);
    }
}