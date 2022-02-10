package com.bridgelabz.employeepayrollapps.model;

import com.bridgelabz.employeepayrollapps.dto.EmployeePayrollDTO;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee_payroll")
public @Data class EmployeePayrollData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "name")
    private String name;
    private long salary;
    private String gender;
    private String startDate;
    private String note;
    private String profile_pic;

    @ElementCollection
    @CollectionTable(name = "department",joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> departments;


    public  EmployeePayrollData(){

    }
    public EmployeePayrollData(EmployeePayrollDTO payrollDTO) {
        this.updateData(payrollDTO);
    }
    public  void updateData(EmployeePayrollDTO payrollDTO){
        this.name = payrollDTO.name;
        this.salary = payrollDTO.salary;
        this.gender = payrollDTO.gender;
        this.startDate = payrollDTO.startDate;
        this.note = payrollDTO.note;
        this.profile_pic = payrollDTO.profile_pic;
        this.departments = payrollDTO.departments;
    }

}
