package com.student;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementmystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentmanagementmystemApplication.class, args);
    }
    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        Student s1 = new Student("Mohammed" , "Ali" , "ma@gmail.com ");
//        studentRepository.save(s1);
//        Student s2 = new Student("Khaled" , "Hassan" , "kh@gmail.com");
//        studentRepository.save(s2);
//        Student s3 = new Student("Chad" , "Emad" , "ch@gmail.com");
//        studentRepository.save(s3);
//        Student s4 = new Student("Coalt" , "Steel" , "cs@gmail.com");
//        studentRepository.save(s4);
//


    }
}
