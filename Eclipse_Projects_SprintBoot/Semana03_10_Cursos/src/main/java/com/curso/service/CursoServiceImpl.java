package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursoDao;
import com.curso.model.Curso;

@Service
public class CursoServiceImpl implements CursoService{
	@Autowired
	CursoDao dao;

	@Override
	public List<Curso> getCursos() {
		return dao.findAll();
	}

	@Override
	public Curso getCurso(int codCurso) {
		return dao.findById(codCurso).orElse(null);
	}

	@Override
	public void addCurso(Curso curso) {
		dao.save(curso);		
	}

	@Override
	public void updateCurso(Curso curso) {
		dao.save(curso);
		
	}

	@Override
	public List<Curso> deleteCurso(int codCurso) {
		dao.deleteById(codCurso);
		return getCursos();
	}

}
