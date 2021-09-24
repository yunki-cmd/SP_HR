package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Deparment;
import com.example.hr.repositorio.RepositorioDepartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServicesImple implements DepartmentServices {
  
  @Autowired
  private RepositorioDepartment department;

  @Override
  public Deparment findByid(Integer id) {
    return department.findById(id).get();
  }

  @Override
  public List<Deparment> findAll() {
    return department.findAll();
    
  }

  


}
