package com.school.demo.students.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student", schema = "dbo")
@NamedQuery(name="Student.findAll", query="SELECT c FROM Student c")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "major")
    private String major;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {return id;}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}