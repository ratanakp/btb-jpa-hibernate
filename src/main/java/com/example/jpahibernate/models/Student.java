package com.example.jpahibernate.models;

import javax.persistence.*;

@Table(name = "tb_student")
@Entity(name = "Student_Entity")

@NamedQuery(name = "studentGetAllNameQuery", query = "select se from Student_Entity se")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_gen")
    @SequenceGenerator(name = "seq_gen", initialValue = 10)
    private Long id;

    @Column(columnDefinition = "varchar (255) ")
    private String name;

    private String gender;

    @Column(columnDefinition = "decimal(10,2)")
    private Double score;

    public Student() {
    }

    public Student(String name, String gender, Double score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }
}
