package com.example.hr.repositorio;

import com.example.hr.entidad.Deparment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioDepartment extends JpaRepository<Deparment,Integer> {
  
}
