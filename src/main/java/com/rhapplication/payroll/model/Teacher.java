package com.rhapplication.payroll.model;


import com.rhapplication.payroll.enumeration.EmployeeType;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Teacher extends EmployeeData{

private double numberHoursWorked;
private List<String> subjectsTaughy;

    public Teacher(double numberHoursWorked, List<String> subjectsTaughy) {
        this.numberHoursWorked = numberHoursWorked;
        this.subjectsTaughy = subjectsTaughy;
    }

    public Teacher(Long id, String name, String ssn, EmployeeType employeeType, double numberHoursWorked, List<String> subjectsTaughy) {
        super(id, name, ssn, employeeType);
        this.numberHoursWorked = numberHoursWorked;
        this.subjectsTaughy = subjectsTaughy;
    }

    public Teacher(){

    }


    public double getNumberHoursWorked() {
        return numberHoursWorked;
    }

    public void setNumberHoursWorked(double numberHoursWorked) {
        this.numberHoursWorked = numberHoursWorked;
    }

    public List<String> getSubjectsTaughy() {
        return subjectsTaughy;
    }

    public void setSubjectsTaughy(List<String> subjectsTaughy) {
        this.subjectsTaughy = subjectsTaughy;
    }


}
