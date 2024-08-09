package com.example.practicesecurity.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.practicesecurity.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	 @Bean
	 public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	 }
	 
	 @Bean
	 public UserDetailsService userDetailsService() {
		 return new CustomUserDetailsService();
	 }
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.csrf().disable();
        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/api/users/register", "/api/users/login").permitAll() // Allow access to registration and login
                .anyRequest().authenticated() // Secure all other endpoints
                
            );
        http.httpBasic();
        http.userDetailsService(userDetailsService());
        http.formLogin().disable();
        return http.build();
    }
}

