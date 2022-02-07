package com.bridgelabz.employeepayrollapps.controller;

import com.bridgelabz.employeepayrollapps.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapps.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapps.model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
    @RequestMapping(value={"","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData()
    {
        EmployeePayrollData payrollData=null;
        payrollData=new EmployeePayrollData(1,new EmployeePayrollDTO("SAI",1000));
        ResponseDTO responseDTO=new ResponseDTO("get call success",payrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/{empId}")
    public  ResponseEntity<String> getEmployeeData(@PathVariable("empId") int empId){
        return  new ResponseEntity<String>("Get call sucess for id"+empId,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO payrollDTO){
        return new ResponseEntity<String>("Created data"+payrollDTO,HttpStatus.OK);
    }
    @PutMapping("/edit")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO payrollDTO) {
        return new ResponseEntity<String>("Created data" + payrollDTO, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
    public  ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") long empId){
        return new ResponseEntity<String>(" data deleted " + empId, HttpStatus.OK);
    }
}
