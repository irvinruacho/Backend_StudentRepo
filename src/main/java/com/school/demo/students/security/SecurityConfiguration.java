//package com.school.demo.students.security;
//
//import com.school.demo.students.service.CustomUserDetailsService;
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
//    private final CustomUserDetailsService customUserDetailsService;
//
//    public SecurityConfiguration(CustomUserDetailsService customUserDetailsService) {
//        this.customUserDetailsService = customUserDetailsService;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customUserDetailsService)
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
//                .antMatchers("/login", "/public/**").permitAll() // Permite el acceso sin autenticación a /login y /public
//                .anyRequest().authenticated() // Requiere autenticación para todas las demás rutas
//                .and()
//                .formLogin()
//                .loginPage("/login") // Ruta de la página de inicio de sesión personalizada
//                .defaultSuccessUrl("/home") // Redirige a /home tras un inicio de sesión exitoso
//                .permitAll()
//                .and()
//                .logout() // Configura el cierre de sesión
//                .permitAll();
//    }
//}
