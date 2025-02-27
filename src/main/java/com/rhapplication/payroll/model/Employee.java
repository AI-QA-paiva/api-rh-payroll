package com.rhapplication.payroll.model;

import com.rhapplication.payroll.enumeration.AcademicBackground;
import com.rhapplication.payroll.enumeration.EmployeeType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee extends PersonData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private AcademicBackground academicBackground;
    private EmployeeType employeeType;
    private String employeeRecord;
    private String employeeEmail;
    private String lotacao;
    private String department;
    private int workingMonth;
    private String contractType;



}
