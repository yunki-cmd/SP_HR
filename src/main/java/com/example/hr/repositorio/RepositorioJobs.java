package com.example.hr.repositorio;

import java.util.List;

import com.example.hr.entidad.Employees;
import com.example.hr.entidad.Jobs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositorioJobs extends JpaRepository<Jobs, String> {
  
  @Query(value = "SELECT *  from jobs  where JOB_TITLE =?1",nativeQuery = true)
  public List<Jobs> getListEmployerByJob(String job);

}
