//package com.school.demo.students.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    // Método para buscar un usuario por nombre de usuario
//    public Optional<User> findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//}
