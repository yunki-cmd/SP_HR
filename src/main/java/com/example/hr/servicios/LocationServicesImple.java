package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Locations;
import com.example.hr.repositorio.RepositorioLocations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocationServicesImple implements LocationServices {

  @Autowired
  private RepositorioLocations locations;

  @Override
  public List<Locations> findAll() {
    return locations.findAll();
  }

  @Override
  public Locations findByID(Integer id) {
    return locations.getById(id);
  }



  @Override
  public String getPaisbyCity(String city) {
    return locations.getPaisbyCity(city);
  }
  
}
