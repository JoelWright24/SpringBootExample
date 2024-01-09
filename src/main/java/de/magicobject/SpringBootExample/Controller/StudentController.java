package de.magicobject.SpringBootExample.Controller;

import de.magicobject.SpringBootExample.Entity.Student;
import de.magicobject.SpringBootExample.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;



    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // method to get all students
    @GetMapping(path = "/allStudents")
    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> Students = studentService.getAllStudents();
        return Students;
    }

    // add a student
    @PostMapping(path = "/addStudent")
    public void addStudent(Student student) {
        studentService.addStudent(student);
    }



}
