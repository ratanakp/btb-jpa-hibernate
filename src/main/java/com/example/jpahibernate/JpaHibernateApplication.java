package com.example.jpahibernate;

import com.example.jpahibernate.models.Student;
import com.example.jpahibernate.repositories.StudentRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories
@EntityScan
public class JpaHibernateApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateApplication.class, args);
    }

//    private StudentService studentService;


//    public JpaHibernateApplication(StudentService studentService) {
//        this.studentService = studentService;
//    }


    private StudentRepository studentRepository;

    public JpaHibernateApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Student student = new Student("Student Name", "male", 12.5);
        Student student1 = new Student("Student Name 1", "female", 55.5);
        Student student2 = new Student("Student Name 1", "female", 55.5);


        this.studentRepository.save(student);
        this.studentRepository.save(student1);
        this.studentRepository.save(student2);

//        this.studentRepository.deleteById(11L);


        System.out.println(this.studentRepository.findAll());


        System.out.println("meme: " + this.studentRepository.findStudentById(10L));

        System.out.println("Count Student: " + this.studentRepository.count());

        System.out.println("test: " + this.studentRepository.findStudentByIdAndGender(10L, ""));








        /*this.studentService.save(student);
        this.studentService.save(student1);

        System.out.println(this.studentService.findOneStudent(10L));


        System.out.println("===============================");
        System.out.println(this.studentService.getAll());*/
    }
}
