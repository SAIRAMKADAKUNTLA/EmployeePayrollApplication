package com.bridgelabz.employeepayrollapps.repository;

import com.bridgelabz.employeepayrollapps.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepo extends JpaRepository<EmployeePayrollData,Integer> {
}
