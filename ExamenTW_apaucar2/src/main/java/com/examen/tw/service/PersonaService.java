package com.examen.tw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.tw.dao.IPersonaDao;
import com.examen.tw.entity.Persona;;
 
@Service
public class PersonaService {
	
	@Autowired
	private IPersonaDao personaDao;
	
	public List<Persona> getPersonas() {
		return (List<Persona>) personaDao.findAll();
	}
}
