package com.example.demo.employee;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(2)
public class UserSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.antMatcher("/employee/**")
			.authorizeRequests().anyRequest().hasAuthority("EMPLOYEE")
			.and()
			.formLogin()
				.loginPage("/employee/login")
				.usernameParameter("username")
				.loginProcessingUrl("/employee/login")
				.defaultSuccessUrl("/employee/home")
				.permitAll()
			.and()
			.logout()
				.logoutUrl("/employee/logout")
				.logoutSuccessUrl("/");		
	}	
}
