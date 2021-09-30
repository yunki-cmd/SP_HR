package com.example.hr.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Regions {
  
  @Id
  private Integer region_id;

  @Column(name = "REGION_NAME")
  private String region_name;

  public Regions(){}

  /**
   * @param region_id
   * @param region_name
   */
  public Regions(Integer region_id, String region_name) {
    this.region_id = region_id;
    this.region_name = region_name;
  }
  /**
   * @return the region_id
   */
  public Integer getRegion_id() {
    return region_id;
  }
  /**
   * @param region_name
   */
  public Regions(String region_name) {
    this.region_name = region_name;
  }
  /**
   * @return the region_name
   */
  public String getRegion_name() {
    return region_name;
  }
}
