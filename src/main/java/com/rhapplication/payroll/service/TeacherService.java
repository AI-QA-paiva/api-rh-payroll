package com.rhapplication.payroll.service;


import com.rhapplication.payroll.model.Teacher;
import com.rhapplication.payroll.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher creatingTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> listTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getOnlyOneTeacher(Long id) {
        return teacherRepository.findById(id);
    }

    public Teacher getSsnTeacher(String ssn) {
        return  teacherRepository.findBySsn(ssn).orElseThrow();
    }

    public Teacher changeData(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteOneTeacher(Long id){
        teacherRepository.deleteById(id);
    }


}
