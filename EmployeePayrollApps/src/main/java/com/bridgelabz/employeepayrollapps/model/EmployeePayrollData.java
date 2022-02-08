package com.bridgelabz.employeepayrollapps.model;

import com.bridgelabz.employeepayrollapps.dto.EmployeePayrollDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeePayrollData {
    private int employeeId;
    private String name;
    private long salary;

    public  EmployeePayrollData(){

    }
    public EmployeePayrollData(int employeeId, EmployeePayrollDTO payrollDTO) {
        this.employeeId = employeeId;
        this.name = payrollDTO.name;
        this.salary = payrollDTO.salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
