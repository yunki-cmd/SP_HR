package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Locations;

public interface LocationServices {
  
  public List<Locations> findAll();

  public Locations findByID(Integer id);

  public String getPaisbyCity(String city);

}
