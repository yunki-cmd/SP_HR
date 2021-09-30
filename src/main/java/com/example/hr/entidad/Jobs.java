package com.example.hr.entidad;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "jobs")
public class Jobs {
    
    @Id
    @Column(name="JOB_ID")
    private String job_id;

    @Column(name = "JOB_TITLE")
    private String job_title;

    @Column(name = "MIN_SALARY")
    private Integer min_salary;
    
    @Column(name = "MAX_SALARY")
    private Integer max_salary;

    @OneToMany
    @JoinColumn(name = "JOB_ID",referencedColumnName = "JOB_ID")
    private List<Employees> employer;

  
    /**
     * @return the employer
     */
    public List<Employees> getEmployer() {
      return employer;
    }
    /**
     * @param employer the employer to set
     */
    public void setEmployer(List<Employees> employer) {
      this.employer = employer;
    }
    /**
     * @param job_id
     * @param job_title
     * @param min_salary
     * @param max_salary
     */
    public Jobs(String job_id, String job_title, Integer min_salary, Integer max_salary) {
      
      this.job_title = job_title;
      this.min_salary = min_salary;
      this.max_salary = max_salary;
    }
    public Jobs(){}

    /**
     * @return the job_id
     */
   

    /**
     * @param job_id the job_id to set
     */
    

    /**
     * @return the job_title
     */
    public String getJob_title() {
      return job_title;
    }

    /**
     * @param job_title the job_title to set
     */
    public void setJob_title(String job_title) {
      this.job_title = job_title;
    }

    /**
     * @return the min_salary
     */
    public Integer getMin_salary() {
      return min_salary;
    }

    /**
     * @param min_salary the min_salary to set
     */
    public void setMin_salary(Integer min_salary) {
      this.min_salary = min_salary;
    }

    /**
     * @return the max_salary
     */
    public Integer getMax_salary() {
      return max_salary;
    }

    /**
     * @param max_salary the max_salary to set
     */
    public void setMax_salary(Integer max_salary) {
      this.max_salary = max_salary;
    }

    

}
