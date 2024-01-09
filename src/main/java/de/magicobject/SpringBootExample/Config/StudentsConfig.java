package de.magicobject.SpringBootExample.Config;

import de.magicobject.SpringBootExample.Entity.Student;
import de.magicobject.SpringBootExample.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentsConfig {

    // set up students that we can save to the database on load
    @Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
        return args -> {
            //Keith
            Student student1 = new Student(1L, "Keith", "Keith@magicobject.de");

            //Robert
            Student student2 = new Student(2L, "Robert", "Robert@magicobject.de");

            //Sven
            Student student3 = new Student(3L, "Sven", "Sven@magicobject.de");
            studentRepo.saveAll(List.of(student1, student2, student3));
        };
    }
}

