package com.example.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.service.MyUserDetailsService;

@Configuration
@Order(2)
public class UserSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
    UserDetailsService userDetailsService;

    public UserDetailsService userDetailsService() {
        return new MyUserDetailsService();
    }
 
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
    
    @Bean
    public DaoAuthenticationProvider authenticationProvider2()
    {
    	DaoAuthenticationProvider provider =new DaoAuthenticationProvider();
    	provider.setUserDetailsService(userDetailsService);
    	provider.setPasswordEncoder(passwordEncoder());
    	return provider;
    }
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authenticationProvider(authenticationProvider2());
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
