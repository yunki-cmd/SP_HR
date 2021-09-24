package com.example.hr.controlador;

import java.util.List;

import com.example.hr.entidad.Locations;
import com.example.hr.servicios.LocationServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/location")
public class ControladorLocation {
  
  @Autowired
  private LocationServices locationServices;

  @GetMapping(path = {"/all"})
  public List<Locations> getallLocation() {
    return locationServices.findAll();
  }
  @GetMapping(path = {"/city"})
  public String getPaisByCity(@RequestParam(name = "name")String name) {
    return locationServices.getPaisbyCity(name);
  }


  
  

}
