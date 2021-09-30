package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Employees;

public interface EmployeerServices {
  
  public List<Employees> getAllEmployers();

  public List<Employees> empleadoPorPais(String pais);

}
