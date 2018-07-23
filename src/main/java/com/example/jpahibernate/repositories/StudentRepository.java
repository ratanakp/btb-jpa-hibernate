package com.example.jpahibernate.repositories;

import com.example.jpahibernate.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "students-api", collectionResourceRel = "data")
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Override
    @Query("select count (*) from Student_Entity")
    long count();








}
