package com.rajesh.security;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class SecurityConfig {
	@Bean	
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(configurer -> 
		configurer
				.anyRequest()
				.authenticated()
				)
				.formLogin(form -> 
				form
						.loginPage("/MyLoginPage")
						.loginProcessingUrl("/authenticateTheUser")
						.defaultSuccessUrl("/home")
						.failureUrl("/login?error")
						.permitAll()
				)
				.logout(logout -> 
				logout
						.permitAll()
				)
				.exceptionHandling(configurer -> 
				configurer
					.accessDeniedPage("/access-denied")
				);    
		
		return http.build();
	}
	
	 @Bean
	    public UserDetailsService userDetailsService() {
	        UserDetails user = User.withUsername("user")
	            .password(passwordEncoder().encode("password"))
	            .roles("USER")
	            .build();
	        return new InMemoryUserDetailsManager(user);
	    }

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
}
