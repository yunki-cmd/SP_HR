package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Employees;
import com.example.hr.repositorio.RepositorioEmployees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeerServicesImple implements EmployeerServices {

  @Autowired
  private RepositorioEmployees employees;

  @Override
  public List<Employees> getAllEmployers() {
    return employees.findAll();
  }

  @Override
  public List<Employees> empleadoPorPais(String pais) {
    return employees.empleadoPorPais(pais);
  }

  
}
