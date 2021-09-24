package com.example.hr.entidad;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "employees")
public class Employees {
  
  @Id
  private Integer employee_id;
  @Column(name = "FIRST_NAME")
  private String first_name;

  @Column(name = "LAST_NAME")
  private String last_name;

  @Column(name = "EMAIL")
  private String email;

  @Column(name = "PHONE_NUMBER")
  private String phone_number;
  
  @Column(name = "HIRE_DATE")
  private Date hire_date;

  @Column(name = "JOB_ID")
  private String job_id;

  @Column(name = "SALARY")
  private Integer salary;

  @Column(name = "COMMISSION_PCT")
  private Integer commision_pct;

  @Column(name = "MANAGER_ID")
  private Integer manager;

  @ManyToOne
  @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "DEPARTMENT_ID")
  @NotFound(action = NotFoundAction.IGNORE)
  private Deparment deparment;

  public Employees() {
  }

  /**
   * @param employee_id
   * @param first_name
   * @param last_name
   * @param email
   * @param phone_number
   * @param hire_date
   * @param job_id
   * @param salary
   * @param commision_pct
   * @param manager
   * @param deparment
   */
  public Employees(Integer employee_id, String first_name, String last_name, String email, String phone_number,
      String hire_date, String job_id, Integer salary, Integer commision_pct, Integer manager, Deparment deparment) {
    this.employee_id = employee_id;
    this.first_name = first_name;
    this.last_name = last_name;
    this.email = email;
    this.phone_number = phone_number;
    try {
      this.hire_date = new SimpleDateFormat("yyyy-MM-dd").parse(hire_date);
    } catch (ParseException e) {
      this.hire_date = null;
    }
    this.job_id = job_id;
    this.salary = salary;
    this.commision_pct = commision_pct;
    this.manager = manager;
    this.deparment = deparment;
  }

  /**
   * @return the employee_id
   */
  public Integer getEmployee_id() {
    return employee_id;
  }

  /**
   * @param employee_id the employee_id to set
   */
  public void setEmployee_id(Integer employee_id) {
    this.employee_id = employee_id;
  }

  /**
   * @return the first_name
   */
  public String getFirst_name() {
    return first_name;
  }

  /**
   * @param first_name the first_name to set
   */
  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  /**
   * @return the last_name
   */
  public String getLast_name() {
    return last_name;
  }

  /**
   * @param last_name the last_name to set
   */
  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the phone_number
   */
  public String getPhone_number() {
    return phone_number;
  }

  /**
   * @param phone_number the phone_number to set
   */
  public void setPhone_number(String phone_number) {
    this.phone_number = phone_number;
  }

  /**
   * @return the hire_date
   */
  public Date getHire_date() {
    return this.hire_date;
  }

  /**
   * @param hire_date the hire_date to set
   */
  public void setHire_date(String hire_date) {
    try {
      this.hire_date = new SimpleDateFormat("yyyy-MM-dd").parse(hire_date);
    } catch (ParseException e) {
      this.hire_date = null;
    }
    
  }

  /**
   * @return the job_id
   */
  public String getJob_id() {
    return job_id;
  }

  /**
   * @param job_id the job_id to set
   */
  public void setJob_id(String job_id) {
    this.job_id = job_id;
  }

  /**
   * @return the salary
   */
  public Integer getSalary() {
    return salary;
  }

  /**
   * @param salary the salary to set
   */
  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  /**
   * @return the commision_pct
   */
  public Integer getCommision_pct() {
    return commision_pct;
  }

  /**
   * @param commision_pct the commision_pct to set
   */
  public void setCommision_pct(Integer commision_pct) {
    this.commision_pct = commision_pct;
  }

  /**
   * @return the manager
   */
  public Integer getManager() {
    return manager;
  }

  /**
   * @param manager the manager to set
   */
  public void setManager(Integer manager) {
    this.manager = manager;
  }

  /**
   * @return the deparment
   */
  public Deparment getDeparment() {
    return deparment;
  }

  /**
   * @param deparment the deparment to set
   */
  public void setDeparment(Deparment deparment) {
    this.deparment = deparment;
  }
  
  

}
