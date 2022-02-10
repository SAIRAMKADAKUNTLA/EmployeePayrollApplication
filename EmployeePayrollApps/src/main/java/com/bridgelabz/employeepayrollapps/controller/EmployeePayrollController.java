package com.bridgelabz.employeepayrollapps.controller;

import com.bridgelabz.employeepayrollapps.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapps.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapps.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapps.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {


    @Autowired
    private IEmployeePayrollService service;

    @RequestMapping(value={"","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData()
    {
        List<EmployeePayrollData> payrollData=service.getEmployeePayroll();
        ResponseDTO responseDTO=new ResponseDTO("get call success",payrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/{empId}")
    public  ResponseEntity<ResponseDTO> getEmployeeData(@PathVariable("empId") int empId){
        EmployeePayrollData payrollData=service.getEmployeePayrollById(empId);
        ResponseDTO responseDTO=new ResponseDTO("get call from id",payrollData);
        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO payrollDTO){
        EmployeePayrollData payrollData=service.createEmployeePayroll(payrollDTO);
        ResponseDTO responseDTO=new ResponseDTO("data created successfully",payrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @PutMapping("/edit/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId") int empId,@RequestBody EmployeePayrollDTO payrollDTO) {
        EmployeePayrollData payrollData=service.updateEmployeePayroll(empId,payrollDTO);
        ResponseDTO responseDTO=new ResponseDTO("edited successfully",payrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
    public  ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        service.deleteEmployeePayroll(empId);
        ResponseDTO responseDTO=new ResponseDTO("deleted successfully",+empId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
