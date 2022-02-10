package com.bridgelabz.employeepayrollapps.service;

import com.bridgelabz.employeepayrollapps.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapps.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayroll();

    EmployeePayrollData getEmployeePayrollById(int empId);

    EmployeePayrollData createEmployeePayroll(EmployeePayrollDTO payrollDTO);

    EmployeePayrollData updateEmployeePayroll(int empId,EmployeePayrollDTO payrollDTO);

    void deleteEmployeePayroll(int empId);
}
