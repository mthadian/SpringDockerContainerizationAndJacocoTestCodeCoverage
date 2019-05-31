/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SAF.MovieBackEnd.Configs;

import javax.sql.DataSource;
import javax.servlet.annotation.WebServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author PMMuthama
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder managerBuilder) throws Exception{
        managerBuilder.inMemoryAuthentication()
                .withUser("user1").password("{noop}user1").roles("USER").and()
                .withUser("admin1").password("{noop}admin1").roles("ADMIN");
    }
    
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/v2/api-docs",
                                   "/configuration/ui",
                                   "/swagger-resources",
                                   "/configuration/security",
                                   "/swagger-ui.html",
                                   "/webjars/**");
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic().and().authorizeRequests()
        		//.antMatchers("/**").permitAll()
        		
        		
                .antMatchers("/api/**").hasRole("ADMIN")
                .antMatchers("/**").hasRole("ADMIN")
                .antMatchers("/api/**").hasRole("USER")  
               
               
               
                
                
                .and().csrf().disable().headers().frameOptions().disable();
    }
} 
