package com.example.demo.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.service.MyUserDetailsService;

@EnableWebSecurity
@Configuration
@Order(1)
public class HR_Security_Config extends WebSecurityConfigurerAdapter {

	
    @Autowired
    UserDetailsService userDetailsService;
    @Bean
    public UserDetailsService userDetailsService() {
        return new MyUserDetailsService();
    }
 
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
    
    @Bean
    public DaoAuthenticationProvider authenticationProvider1()
    {
    	DaoAuthenticationProvider provider =new DaoAuthenticationProvider();
    	provider.setUserDetailsService(userDetailsService);
    	provider.setPasswordEncoder(passwordEncoder());
    	return provider;
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll();
        http.antMatcher("/hr/**")
        .authorizeRequests().anyRequest().authenticated()
        .and()
        .formLogin()
            .loginPage("/hr/login")
            .usernameParameter("username")
            .loginProcessingUrl("/hr/login")
            .defaultSuccessUrl("/hr/home")
            .permitAll()
        .and()
        .logout()
            .logoutUrl("/hr/logout")
            .logoutSuccessUrl("/");
        
        
        
    }  

	}
		

//.antMatchers("/hr/login")
//.hasAuthority("HR")
//.antMatchers("/employee/login")
//.hasAuthority("EMPLOYEE")
//.anyRequest()
//.authenticated()
//.and()
//.httpBasic();
//




