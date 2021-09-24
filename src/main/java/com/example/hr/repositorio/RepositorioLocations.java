package com.example.hr.repositorio;

import com.example.hr.entidad.Locations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositorioLocations extends JpaRepository<Locations, Integer> {
  
  @Query(value = "SELECT countries.COUNTRY_NAME as pais FROM countries INNER join locations on locations.COUNTRY_ID = countries.COUNTRY_ID INNER join regions on regions.REGION_ID = countries.REGION_ID WHERE locations.CITY=?1",nativeQuery = true)
  public String getPaisbyCity(String city);
 
}
