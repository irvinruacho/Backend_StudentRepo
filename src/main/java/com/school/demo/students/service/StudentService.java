package com.school.demo.students.service;

import com.school.demo.students.entity.Student;
import com.school.demo.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public List<Student> findByMajor(String major) {
        return studentRepository.findByMajor(major);
    }

    public List<Student> findByAge(int age) {
        return studentRepository.findByAge(age);
    }

    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Create a new student
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update an existing student
    public Student updateStudent(Long id, Student updatedStudent) {
        // Find the existing student by ID
        Optional<Student> existingStudent = studentRepository.findById(id);

        if (existingStudent.isPresent()) {
            // Update the student's properties
            Student student = existingStudent.get();
            student.setFirstName(updatedStudent.getFirstName());
            student.setLastName(updatedStudent.getLastName());
            student.setAge(updatedStudent.getAge());
            student.setMajor(updatedStudent.getMajor());

            // Save the updated student
            return studentRepository.save(student);
        } else {
            throw new RuntimeException("Student not found with ID: " + id);
        }
    }

    // Delete a student by ID
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}