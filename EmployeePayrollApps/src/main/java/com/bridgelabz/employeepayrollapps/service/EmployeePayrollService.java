package com.bridgelabz.employeepayrollapps.service;

import com.bridgelabz.employeepayrollapps.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapps.model.EmployeePayrollData;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService implements IEmployeePayrollService{

    public List<EmployeePayrollData> getEmployeePayroll(){
        List<EmployeePayrollData>data=new ArrayList<>();
        data.add(new EmployeePayrollData(1, new EmployeePayrollDTO("sai",19746738)));
        return data;
    }
}
