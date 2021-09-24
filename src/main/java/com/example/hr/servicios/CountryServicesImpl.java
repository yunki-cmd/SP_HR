package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Country;
import com.example.hr.repositorio.RepositorioCountry;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServicesImpl implements CountryServices {

  @Autowired
  private RepositorioCountry country;

  @Override
  public List<Country> findAll() {
    return country.findAll();
  }

  @Override
  public Country findByID(String id) {
    return country.findBynameCountry(id);
  }

  @Override
  public Country findByRegions(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Country> getAllCountryByRegion(String region) {
    return country.listCountryByRegion(region);
  }
  
}
