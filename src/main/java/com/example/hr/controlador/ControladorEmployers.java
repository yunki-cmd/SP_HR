package com.example.hr.controlador;

import java.util.List;

import com.example.hr.entidad.Employees;
import com.example.hr.servicios.EmployeerServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employer")
public class ControladorEmployers {
  
  @Autowired
  private EmployeerServices services;

  @GetMapping(path = {"/all"})
  public List<Employees> getAllEmployers() {
    return services.getAllEmployers();
  }


}
