package com.example.hr.repositorio;

import com.example.hr.entidad.Regions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioRegion extends JpaRepository<Regions,Integer> {
  
}
