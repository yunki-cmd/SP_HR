package com.example.hr.servicios;

import java.util.List;

import com.example.hr.entidad.Employees;
import com.example.hr.entidad.Jobs;
import com.example.hr.repositorio.RepositorioJobs;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobsServicesImple implements JobsServices{
  
  @Autowired
  private RepositorioJobs jobs;

  @Override
  public List<Jobs> getAllJobs() {
    return jobs.findAll();
  }


  @Override
  public List<Jobs> getEmployerbyJob(String job) {
    return jobs.getListEmployerByJob(job);
  }

  

}
