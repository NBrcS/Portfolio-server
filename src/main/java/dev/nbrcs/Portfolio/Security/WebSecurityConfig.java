package dev.nbrcs.Portfolio.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.net.Authenticator;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/courses").hasAnyRole("Admins")
                .antMatchers("/projects").hasAnyRole("Admins")
                .antMatchers("/courses").hasAnyRole("Users")
                .antMatchers("/projects").hasAnyRole("Users")
                .anyRequest().authenticated().and().formLogin();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("nbAdmin")
                .password("{noop}nbAdmin7756")
                .roles("Admins")
                .and()
                .withUser("commonUser")
                .password("{noop}user")
                .roles("Users");
    }
}
