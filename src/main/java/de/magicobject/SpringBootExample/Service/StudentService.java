package de.magicobject.SpringBootExample.Service;

import de.magicobject.SpringBootExample.Entity.Student;
import de.magicobject.SpringBootExample.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public ArrayList<Student> getAllStudents() {
        return (ArrayList<Student>) studentRepo.findAll();
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }
}
