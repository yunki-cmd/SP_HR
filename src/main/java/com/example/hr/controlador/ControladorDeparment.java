package com.example.hr.controlador;

import java.util.List;

import com.example.hr.entidad.Deparment;
import com.example.hr.servicios.DepartmentServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/department")
public class ControladorDeparment {
  
  @Autowired
  private DepartmentServices services;

  @GetMapping(path = {"/id"})
  public Deparment getById(@RequestParam(name = "id") Integer id) {
    return services.findByid(id);
  }
  @GetMapping(path = {"/all"})
  public List<Deparment> getallDepartment() {
    return services.findAll();
  }



}
