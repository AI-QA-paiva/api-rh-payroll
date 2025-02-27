package com.rhapplication.payroll.repository;

import com.rhapplication.payroll.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository <Teacher, Long> {

    Optional<Teacher> findBySsn(String ssn);


}
