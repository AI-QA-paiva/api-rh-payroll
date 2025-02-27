package com.rhapplication.payroll.model;

import com.rhapplication.payroll.enumeration.EmployeeType;
import com.rhapplication.payroll.enumeration.PersonType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@MappedSuperclass
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class PersonData {

    private String name;
    private String ssn;
    private String rg;
    private LocalDate dateOfBirth;
    private String motherName;
    private String personEmail;
    private String phoneNumber;
    private PersonType personType;

}
