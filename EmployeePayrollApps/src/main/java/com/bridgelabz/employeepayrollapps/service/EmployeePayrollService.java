package com.bridgelabz.employeepayrollapps.service;

import com.bridgelabz.employeepayrollapps.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapps.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
    List<EmployeePayrollData>payrollData=new ArrayList<>();

    public List<EmployeePayrollData> getEmployeePayroll(){
        return payrollData;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollById(int empId) {
        return payrollData.get(empId-1);
    }

    @Override
    public EmployeePayrollData createEmployeePayroll(EmployeePayrollDTO payrollDTO) {
        EmployeePayrollData empData=null;
        empData=new EmployeePayrollData(payrollData.size()+1,payrollDTO);
        payrollData.add(empData);
        return empData;
    }

    @Override
    public List<EmployeePayrollData> updateEmployeePayroll(int empId,EmployeePayrollDTO payrollDTO) {
        EmployeePayrollData employeePayrollData=this.getEmployeePayrollById(empId);
        employeePayrollData.setName(payrollDTO.name);
        employeePayrollData.setSalary(payrollDTO.salary);
        payrollData.set(empId-1,employeePayrollData);
        return payrollData;
    }

    @Override
    public EmployeePayrollData deleteEmployeePayroll(int empId) {
        return payrollData.remove(empId-1);
    }
}
