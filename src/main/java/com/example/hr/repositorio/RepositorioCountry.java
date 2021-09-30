package com.example.hr.repositorio;

import java.util.List;

import javax.transaction.Transactional;

import com.example.hr.entidad.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

@Transactional
public interface RepositorioCountry extends JpaRepository<Country, String> {
  
  @Query("select c from  Country c where c.country_name = ?1")
  Country findBynameCountry(String name);
  
  @Query(value = "select * from Countries  INNER JOIN Regions on Countries.region_id= Regions.region_id WHERE Regions.region_name=?1", nativeQuery = true)
  public List<Country> listCountryByRegion(String region);
  
 @Query(value = "select COUNT(COUNTRY_NAME) as totalPais,regions.REGION_NAME as Continente from countries,regions where countries.REGION_ID = regions.REGION_ID GROUP BY regions.REGION_NAME",nativeQuery = true)
 public List<String> listCantidadPaisByRegion();

  /* @Query(value = "select * from countries,regions where countries.REGION_ID = regions.REGION_ID GROUP BY regions.REGION_NAME", nativeQuery = true)
  public List<String> listCantidadPaisByRegion(); */
  @Modifying
  @Query(value = "DELETE FROM countries WHERE COUNTRY_NAME = ?1",nativeQuery = true)
  public void deleteByName(String pais);

}
