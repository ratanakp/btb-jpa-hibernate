package com.example.jpahibernate.services;

import com.example.jpahibernate.models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class StudentService {

    @PersistenceContext
    private EntityManager entityManager;

    public StudentService() {
    }

    public void save(Student student) {
        entityManager.persist(student);
    }

    public Student findOneStudent(Long id) {
        return entityManager.find(Student.class, id);
    }


    public List<Student> getAll() {
//        TypedQuery query = entityManager.createQuery("select se from Student_Entity se", Student.class);
       return entityManager.createNamedQuery("studentGetAllNameQuery",Student.class).getResultList();


    }


}
