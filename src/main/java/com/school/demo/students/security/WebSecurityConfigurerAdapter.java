//package com.school.demo.students.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    private final UserService userService;
//
//    @Autowired
//    public SecurityConfiguration(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService::findByUsername)
//                .passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/login", "/public/**").permitAll() // Permitir acceso sin autenticación
//                .anyRequest().authenticated() // Requiere autenticación para todas las demás rutas
//                .and()
//                .formLogin()
//                .loginPage("/login") // Ruta a la página de inicio de sesión personalizada
//                .defaultSuccessUrl("/home") // Redirige a /home tras iniciar sesión
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }
//}
