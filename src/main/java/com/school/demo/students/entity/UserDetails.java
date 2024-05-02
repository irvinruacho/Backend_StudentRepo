//package com.school.demo.students.entity;
//
//import org.apache.catalina.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import java.util.Collection;
//
//public class CustomUserDetails implements UserDetails {
//    private final User user;
//
//    public CustomUserDetails(User user) {
//        this.user = user;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        // Devuelve las autoridades/roles del usuario
//        return user.getRoles();
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        // Puedes personalizar la lógica según tus necesidades
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        // Puedes personalizar la lógica según tus necesidades
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        // Puedes personalizar la lógica según tus necesidades
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        // Puedes personalizar la lógica según tus necesidades
//        return true;
//    }
//}