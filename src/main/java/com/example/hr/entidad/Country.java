package com.example.hr.entidad;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "countries")
public class Country {
  
  @Id
  @Column(name = "COUNTRY_ID")
  private String country_id;

  @Column(name = "COUNTRY_NAME")
  private String country_name;

  @Column(name = "REGION_ID")
  private Integer region_id;

  @ManyToOne
  @JoinColumn(name = "REGION_ID",referencedColumnName = "REGION_ID",columnDefinition = "REGION_ID",insertable = false,updatable = false)
  private  Regions region;

  public Country(String country_id, String country_name, Integer region_id) {
    this.country_id = country_id;
    this.country_name = country_name;
    this.region_id = region_id;
  }

  public Country() {}


  /**
   * @return the country_id
   */
  public String getCountry_id() {
    return country_id;
  }
  /**
   * @return the country_name
   */
  public String getCountry_name() {
    return country_name;
  }

  /**
   * @param country_id the country_id to set
   */
  public void setCountry_id(String country_id) {
    this.country_id = country_id;
  }
  /**
   * @param country_name the country_name to set
   */
  public void setCountry_name(String country_name) {
    this.country_name = country_name;
  }


  public Regions getRegion() {
    return region;
  }

  public void setRegion(Regions region) {
    this.region = region;
  }

  /**
   * @return the region_id
   */
  public Integer getRegion_id() {
    return region_id;
  }

  /**
   * @param region_id the region_id to set
   */
  public void setRegion_id(Integer region_id) {
    this.region_id = region_id;
  }

}
