package com.rhapplication.payroll.model;

import com.rhapplication.payroll.enumeration.ClassShift;
import com.rhapplication.payroll.enumeration.ClassSubjetcs;
import com.rhapplication.payroll.enumeration.Classes;
import com.rhapplication.payroll.enumeration.CourseType;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher extends Employee{

    private CourseType courseType;
    private List<ClassSubjetcs> discipline;
    private List<ClassShift> classShift;
    private List<Classes> classes;
    private double weeklyHours;


}
