package com.bridgelabz.employeepayrollapps.service;

import com.bridgelabz.employeepayrollapps.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapps.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollapps.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapps.repository.EmployeePayrollRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService{

    @Autowired
    EmployeePayrollRepo payrollRepo;

    List<EmployeePayrollData>payrollData=new ArrayList<>();

    public List<EmployeePayrollData> getEmployeePayroll(){

        return payrollRepo.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeePayrollById(int empId) {

        return payrollRepo.findById(empId).orElseThrow(() -> new EmployeePayrollException("employee not found with "+empId));
    }

    @Override
    public EmployeePayrollData createEmployeePayroll(EmployeePayrollDTO payrollDTO) {
        EmployeePayrollData empData=null;
        empData=new EmployeePayrollData(payrollDTO);
        log.debug("data "+empData.toString());
        return payrollRepo.save(empData);
    }

    @Override
    public EmployeePayrollData updateEmployeePayroll(int empId,EmployeePayrollDTO payrollDTO) {
        EmployeePayrollData empData=this.getEmployeePayrollById(empId);
        empData.updateData(payrollDTO);
        return payrollRepo.save(empData);
    }

    @Override
    public void deleteEmployeePayroll(int empId) {
        EmployeePayrollData empData=this.getEmployeePayrollById(empId);
        payrollRepo.delete(empData);
    }
}
