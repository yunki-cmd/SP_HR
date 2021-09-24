package com.example.hr.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Regions {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer region_id;

  @Column(name = "REGION_NAME")
  private String region_name;

  /**
   * @return the region_id
   */
  public Integer getRegion_id() {
    return region_id;
  }
  /**
   * @return the region_name
   */
  public String getRegion_name() {
    return region_name;
  }
  /**
   * @param region_name the region_name to set
   */
  public void setRegion_name(String region_name) {
    this.region_name = region_name;
  }


}
