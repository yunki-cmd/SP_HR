package com.example.hr.entidad;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="locations")
public class Locations {
  
  @Id
  @Column(name="LOCATION_ID")
  private Integer location_id;

  @Column(name="STREET_ADDRESS")
  private String street_address;

  @Column(name="POSTAL_CODE")
  private String postal_code;

  @Column(name="CITY")
  private String city;

  @Column(name="STATE_PROVINCE")
  private String state_province;

  @ManyToOne
  @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
  @NotFound(action = NotFoundAction.IGNORE)
  private Country country;


  public Locations() {
    super();
  }

  public Locations(Integer location_id, String street_address, String postal_code, String city, String state_province,
      Country country) {
    this.location_id = location_id;
    this.street_address = street_address;
    this.postal_code = postal_code;
    this.city = city;
    this.state_province = state_province;
  }

  /**
   * @return the state_province
   */
  public String getState_province() {
    return state_province;
  }
  /**
   * @return the city
   */
  public String getCity() {
    return city;
  }
  /**
   * @return the country
   */
  public Country getCountry() {
    return country;
  }
  /**
   * @return the location_id
   */
  public Integer getLocation_id() {
    return location_id;
  }
  /**
   * @return the postal_code
   */
  public String getPostal_code() {
    return postal_code;
  }
  /**
   * @return the street_address
   */
  public String getStreet_address() {
    return street_address;
  }
  /**
   * @param city the city to set
   */
  public void setCity(String city) {
    this.city = city;
  }
  /**
   * @param country the country to set
   */
  public void setCountry(Country country) {
    this.country = country;
  }
  /**
   * @param location_id the location_id to set
   */
  public void setLocation_id(Integer location_id) {
    this.location_id = location_id;
  }
  /**
   * @param postal_code the postal_code to set
   */
  public void setPostal_code(String postal_code) {
    this.postal_code = postal_code;
  }
  /**
   * @param state_province the state_province to set
   */
  public void setState_province(String state_province) {
    this.state_province = state_province;
  }
  /**
   * @param street_address the street_address to set
   */
  public void setStreet_address(String street_address) {
    this.street_address = street_address;
  }
  


}
