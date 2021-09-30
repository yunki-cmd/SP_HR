package com.example.hr.controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.example.hr.entidad.Employees;
import com.example.hr.servicios.EmployeerServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employer")
public class ControladorEmployers {
  
  @Autowired
  private EmployeerServices services;

  @GetMapping(path = {"/all"})
  public List<Employees> getAllEmployers() throws ParseException {
    List<Employees> resultados = services.getAllEmployers();
    SimpleDateFormat objSDF = new SimpleDateFormat("yyyy-mm-dd");
    for (Employees employees : resultados) {
      String fecha = employees.getHire_date().toString();
      Date date = objSDF.parse(fecha);
      employees.setHire_date(date);
    }
    return resultados;
  }
  @GetMapping(path = {"/pais"})
  public List<Employees> empleadoPorPais(@RequestParam(name = "name") String pais) {
    return services.empleadoPorPais(pais);
  }

}
