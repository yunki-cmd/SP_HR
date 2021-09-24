package com.example.hr.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Deparment {

  @Id
  @Column(name = "DEPARTMENT_ID")
  private Integer department_id;

  @Column(name = "DEPARTMENT_NAME")
  private String department_name;

  @Column(name = "MANAGER_ID")
  private Integer manager_id;

  @ManyToOne
  @JoinColumn(name = "LOCATION_ID")
  private Locations locations;
  
  public Deparment(){}

  public Deparment(Integer department_id, String department_name, Integer manager_id, Locations locations) {
    this.department_id = department_id;
    this.department_name = department_name;
    this.manager_id = manager_id;
    this.locations = locations;
  }
  
  /**
   * @return the department_id
   */
  public Integer getDepartment_id() {
    return department_id;
  }
  /**
   * @return the department_name
   */
  public String getDepartment_name() {
    return department_name;
  }
  /**
   * @return the locations
   */
  public Locations getLocations() {
    return locations;
  }
  /**
   * @return the manager_id
   */
  public Integer getManager_id() {
    return manager_id;
  }
  /**
   * @param department_id the department_id to set
   */
  public void setDepartment_id(Integer department_id) {
    this.department_id = department_id;
  }
  /**
   * @param department_name the department_name to set
   */
  public void setDepartment_name(String department_name) {
    this.department_name = department_name;
  }
  /**
   * @param locations the locations to set
   */
  public void setLocations(Locations locations) {
    this.locations = locations;
  }
  /**
   * @param manager_id the manager_id to set
   */
  public void setManager_id(Integer manager_id) {
    this.manager_id = manager_id;
  }

}
