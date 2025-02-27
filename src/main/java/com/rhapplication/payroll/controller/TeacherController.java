package com.rhapplication.payroll.controller;

import com.rhapplication.payroll.model.Teacher;
import com.rhapplication.payroll.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/teachers")
public class TeacherController {

    //@Autowired
    private TeacherService teacherService;
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }


    @PostMapping(path = "/teacher")
    public ResponseEntity<Teacher> createATeacher(@RequestBody Teacher teacher){

        Teacher newteacher = teacherService.creatingTeacher(teacher);
        System.out.println(newteacher.toString());
        return new ResponseEntity<>(newteacher, HttpStatus.CREATED);
    }

    @GetMapping(path = "/allteachers")
    public ResponseEntity<List<Teacher>> searchListAllTeachers(){
        return ResponseEntity.ok(teacherService.listTeachers());
    }

    @GetMapping(path = "/teacher/{id}")
    public ResponseEntity<Optional<Teacher>> searchSpecificTeacher(@PathVariable Long id){
        Optional<Teacher> optionalTeacher = teacherService.getOnlyOneTeacher(id);
        return ResponseEntity.ok(optionalTeacher);
    }

    @GetMapping(path = "/teacher/ssn/{ssn}")
    public ResponseEntity<Teacher> searchSsnTeacher(@PathVariable String ssn){
        return ResponseEntity.ok(teacherService.getSsnTeacher(ssn));
    }

    @PutMapping(path = "/teacher/{id}")
    public ResponseEntity<Teacher> changeTeacherData(@RequestBody Teacher teacher, @PathVariable Long id){
        Teacher dataTeacher = teacherService.changeData(teacher);
        return ResponseEntity.ok(dataTeacher);
    }

    @DeleteMapping(path = "/teacher/{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable Long id){
        teacherService.deleteOneTeacher(id);
        //return ResponseEntity.noContent().build();
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }




}
