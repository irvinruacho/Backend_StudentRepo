package com.school.demo.students.repository;

import com.school.demo.students.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // Custom query method to find students by major
    @Query("SELECT s FROM Student s WHERE s.major = :major")
    List<Student> findByMajor(String major);

    // Query method to find students by age
    @Query("SELECT s FROM Student s WHERE s.age = :age")
    List<Student> findByAge(int age);
}
