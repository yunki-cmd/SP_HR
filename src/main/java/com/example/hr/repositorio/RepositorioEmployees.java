package com.example.hr.repositorio;

import com.example.hr.entidad.Employees;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmployees extends JpaRepository<Employees,Integer> {
  
}
