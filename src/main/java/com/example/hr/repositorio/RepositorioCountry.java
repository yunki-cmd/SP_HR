package com.example.hr.repositorio;

import java.util.List;

import com.example.hr.entidad.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositorioCountry extends JpaRepository<Country, String> {
  
  @Query("select c from  Country c where c.country_name = ?1")
  Country findBynameCountry(String name);
  
  @Query(value = "select * from Countries  INNER JOIN Regions on Countries.region_id= Regions.region_id WHERE Regions.region_name=?1", nativeQuery = true)
  List<Country> listCountryByRegion(String region);
  
}
