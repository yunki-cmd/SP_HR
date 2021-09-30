package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Regions;
import com.example.hr.repositorio.RepositorioRegion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionServicesImple implements RegionServices {

  @Autowired
  private RepositorioRegion repositorioRegion;

  @Override
  public List<Regions> findAll() {
    return repositorioRegion.findAll();
  }

  @Override
  public Regions findByID(Integer id) {
    
    return null;
  }

  @Override
  public Regions findByRegions(String name) {
    
    return null;
  }

  @Override
  public void nuevosRegion(Regions region) {
    Regions r1 = new Regions(5,"Antartita");
    repositorioRegion.save(r1);
  }

  @Override
  public void deleteRegion(Integer id) {
    try {
      repositorioRegion.deleteById(id);
    } catch (Exception e) {
      System.out.println("fallo: "+e.getMessage());
    }
    
  }
  
}
