//package com.school.demo.students.service;
//
//import com.school.demo.students.entity.CustomUserDetails;
//import org.apache.catalina.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // Cargar usuario desde la base de datos (o cualquier otra fuente)
//        // Supongamos que tienes un servicio que recupera usuarios por nombre de usuario
//        User user = userService.findByUsername(username);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found: " + username);
//        }
//
//        // Devuelve un objeto UserDetails basado en el usuario encontrado
//        return new CustomUserDetails(user);
//    }
//}