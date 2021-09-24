package com.example.hr.controlador;

import java.util.List;

import com.example.hr.entidad.Country;
import com.example.hr.entidad.Inicio;
import com.example.hr.entidad.Regions;
import com.example.hr.servicios.CountryServices;
import com.example.hr.servicios.RegionServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class ControladorBasic {
  
  @Autowired
  private RegionServicesImple regionServicesImple;

  @Autowired
  private CountryServices countryServices;

  @GetMapping(path={"/home","/"})
  public ModelAndView inicio() {
    ModelAndView modelAndViem = new ModelAndView("index");
    Inicio inicio = new Inicio();
    inicio.setSaludo("hola");
    modelAndViem.addObject("saludo", inicio);
    return modelAndViem;
  }
  
  @GetMapping(path = {"/api/region/all"})
  public List<Regions> allregion() {
    return regionServicesImple.findAll();
  }

  @GetMapping(path = { "/api/country/all" })
  public List<Country> allCountry() {
    return countryServices.findAll();
  }
  
  // endpoint de obtener un pais por nombre
  @GetMapping(path = { "/api/country" })
  public Country findCountrybyname(@RequestParam(name = "name") String name) {
    return countryServices.findByID(name);
  }
  
  // endpoint de obtner lista paises por region
  @GetMapping(path = { "/api/country/region" })
  public List<Country> allCountry(@RequestParam(name = "name") String region) {
    return countryServices.getAllCountryByRegion(region);
  }



}
