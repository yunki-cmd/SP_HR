package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Deparment;

public interface DepartmentServices {
  
  public Deparment findByid(Integer id);

  public List<Deparment> findAll();
}
