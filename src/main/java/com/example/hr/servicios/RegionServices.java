package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Regions;

public interface RegionServices {
  
  public List<Regions> findAll();

  public Regions findByID(Integer id);

  public Regions findByRegions(String name);

  public void nuevosRegion(Regions region);

}
