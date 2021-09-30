package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Employees;
import com.example.hr.entidad.Jobs;

public interface JobsServices {
  
  public List<Jobs> getAllJobs();

  public List<Jobs> getEmployerbyJob(String job);

}
