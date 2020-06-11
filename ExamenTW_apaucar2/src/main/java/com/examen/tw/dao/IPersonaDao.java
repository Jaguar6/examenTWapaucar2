package com.examen.tw.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.tw.entity.Persona;


public interface IPersonaDao extends JpaRepository<Persona,Long>{

}
