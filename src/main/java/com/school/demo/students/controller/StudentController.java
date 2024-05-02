package com.school.demo.students.controller;

import com.school.demo.students.service.StudentService;
import com.school.demo.students.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Controlador para mostrar la vista de índice
    @GetMapping({"/", "/index"})
    public ModelAndView showIndex() {
        // Return the "index" view
        return new ModelAndView("index");
    }

    // Controller method to handle form for creating a new student
//    @GetMapping("/students/new")
//    public String showCreateStudentForm(Model model) {
//        model.addAttribute("student", new Student());
//        return "studentForm";
//    }
//
//    // Controller method to handle form submission for creating a new student
//    @PostMapping("/students/new")
//    public String createStudent(@ModelAttribute Student student) {
//        studentService.createStudent(student);
//        return "redirect:/students";
//    }
//
//    // Controller method to handle form for updating an existing student
//    @GetMapping("/students/edit/{id}")
//    public String showUpdateStudentForm(@PathVariable Long id, Model model) {
//        Optional<Student> student = Optional.ofNullable(studentService.findById(id));
//        student.ifPresent(s -> model.addAttribute("student", s));
//        return "index";
//    }
//
//    // Controller method to handle form submission for updating an existing student
//    @PostMapping("/students/edit/{id}")
//    public String updateStudent(@PathVariable Long id, @ModelAttribute Student student) {
//        studentService.updateStudent(id, student);
//        return "redirect:/students";
//    }
//
//    // Controller method to handle deleting a student
//    @GetMapping("/students/delete/{id}")
//    public String deleteStudent(@PathVariable Long id) {
//        studentService.deleteStudent(id);
//        return "redirect:/students";
//    }

    @GetMapping("/students")
    public ModelAndView listAllStudents(Model model) {

        // Retrieve all students using the service
        List<Student> students = studentService.findAll();
         // Create a ModelAndView object
        ModelAndView modelAndView = new ModelAndView();

        // Add the list of students to the model
        modelAndView.addObject("students", students);

        // Set the view name
        modelAndView.setViewName("students");

        // Return the ModelAndView object
        return modelAndView;
    }

    @GetMapping("/students/major")
    public ModelAndView findStudentsByMajor(@RequestParam("major") String major) {
        // Fetch students by major using the service
        List<Student> students = studentService.findByMajor(major);

        // Create a ModelAndView object
        ModelAndView modelAndView = new ModelAndView("students");

        // Add the list of students to the model
        modelAndView.addObject("students", students);

        return modelAndView;
    }

    // Controller method to search students by age
    @GetMapping("/students/age")
    public ModelAndView findStudentsByAge(@RequestParam("age") int age) {
        // Fetch students by age using the service
        List<Student> students = studentService.findByAge(age);

        // Create a ModelAndView object
        ModelAndView modelAndView = new ModelAndView("students");

        modelAndView.addObject("students", students);

        return modelAndView;
    }

    //@GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping
    public Student addNewStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

//    @PutMapping("/{id}")
//    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
//        Student existingStudent = studentService.findById(id);
//        if (existingStudent != null) {
//            existingStudent.setFirstName(updatedStudent.getFirstName());
//            existingStudent.setLastName(updatedStudent.getLastName());
//            existingStudent.setAge(updatedStudent.getAge());
//            existingStudent.setMajor(updatedStudent.getMajor());
//            return studentService.save(existingStudent);
//        }
//        return null;
//    }

//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable Long id) {
//        studentService.deleteById(id);
//    }
}