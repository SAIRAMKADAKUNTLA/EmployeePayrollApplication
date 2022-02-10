package com.bridgelabz.employeepayrollapps.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.*;
import java.util.List;

public @ToString class EmployeePayrollDTO {

    @Pattern(regexp = "[^A-Z]{1}[A-Za-z]{2,}$",message = "Employee name is valid")
    public String name;
    @Min(value = 10000,message = "minimum salary should br above 10000")
    public long salary;

    @Pattern(regexp = "male|female",message = "gender must be either male or female")
    public String gender;

    @JsonFormat(pattern = "dd mm yyyy")
    @NotNull(message = "start date should not be null")
    @PastOrPresent(message = "date should be past or present day")
    public String startDate;

    @NotBlank(message = "note cant be empty")
    public String note;

    @NotBlank(message = "pic cant be empty")
    public String profile_pic;

    @NotNull(message = "department cant be empty")
    public List<String> departments;




}
