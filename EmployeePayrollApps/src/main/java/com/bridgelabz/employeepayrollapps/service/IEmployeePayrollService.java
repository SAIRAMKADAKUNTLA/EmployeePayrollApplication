package com.bridgelabz.employeepayrollapps.service;

import com.bridgelabz.employeepayrollapps.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapps.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayroll();

    EmployeePayrollData getEmployeePayrollById(int empId);

    List<EmployeePayrollData> createEmployeePayroll(EmployeePayrollDTO payrollDTO);

    List<EmployeePayrollData> updateEmployeePayroll(int empId,EmployeePayrollDTO payrollDTO);

    EmployeePayrollData deleteEmployeePayroll(int empId);
}
