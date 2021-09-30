package com.example.hr.repositorio;

import java.util.List;

import com.example.hr.entidad.Employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositorioEmployees extends JpaRepository<Employees, Integer> {
  

  @Query(value = "SELECT * from employees, departments, locations, countries WHERE employees.DEPARTMENT_ID = departments.DEPARTMENT_ID AND departments.LOCATION_ID= locations.LOCATION_ID and locations.COUNTRY_ID= countries.COUNTRY_ID and COUNTRY_NAME=?1", nativeQuery = true)
  public List<Employees> empleadoPorPais(String pais);
  /* SELECT*
  from employees, departments, locations, countries
  WHERE employees.DEPARTMENT_ID=
  departments.DEPARTMENT_ID AND departments.LOCATION_ID=
  locations.LOCATION_ID and locations.COUNTRY_ID=
  countries.COUNTRY_ID and COUNTRY_NAME="United States of America" */


}
