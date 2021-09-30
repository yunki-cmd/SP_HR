package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Country;

public interface CountryServices {
  public List<Country> findAll();

  public Country findByID(String id);

  public Country findByRegions(String name);

  public List<String> cantidadPaisByregion();

  public List<Country> getAllCountryByRegion(String region);

  public void deletebyId(String pais);

  public void newCountry(Country country);



}
