package com.rajesh.security;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {

        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

        // define query to retrieve a user by username
        jdbcUserDetailsManager.setUsersByUsernameQuery(
                "select id, username, password from users where user_id=?");

        // define query to retrieve the authorities/roles by username
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
                "select id, role from roles where id=?");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        return jdbcUserDetailsManager;
    }
	
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
}    
