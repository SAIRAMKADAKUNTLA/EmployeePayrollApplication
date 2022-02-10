package com.bridgelabz.employeepayrollapps.exception;

import com.bridgelabz.employeepayrollapps.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class EmployeePayrollExceptionHandler {

    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException;

    public ResponseEntity<ResponseDTO> handleEmployeePayrollException(EmployeePayrollException employeePayrollException){
        ResponseDTO responseDTO=new ResponseDTO("exception while processing rest request",employeePayrollException);
        return new   ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }

}
