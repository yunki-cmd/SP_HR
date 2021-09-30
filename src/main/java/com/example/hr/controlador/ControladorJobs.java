package com.example.hr.controlador;

import java.util.List;

import com.example.hr.entidad.Employees;
import com.example.hr.entidad.Jobs;
import com.example.hr.servicios.JobsServices;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/jobs")
public class ControladorJobs {
  
  @Autowired
  private JobsServices jobsServices;

  @GetMapping(value="/all")
  public List<Jobs> getAllJobs() {
    return jobsServices.getAllJobs();
  }
  
  @GetMapping(value = "/job")
  public List<Jobs> getAllJobs(@RequestParam(name = "id") String id) {
      return jobsServices.getEmployerbyJob(id);
     
  }

}
