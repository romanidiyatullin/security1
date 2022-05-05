package com.idiyrom.configs;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication().
                withUser(userBuilder
                        .username("olga")
                        .password("olga")
                        .roles("HR"));
        auth.inMemoryAuthentication().
                withUser(userBuilder
                        .username("liza")
                        .password("liza")
                        .roles("MANAGER"));
        auth.inMemoryAuthentication().
                withUser(userBuilder
                        .username("idiyrom")
                        .password("idiyrom")
                        .roles("EMPLOYEE"));
        auth.inMemoryAuthentication().
                withUser(userBuilder
                        .username("root")
                        .password("root")
                        .roles("HR","MANAGER"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/hr").hasRole("HR")
                                .antMatchers("/manager").hasRole("MANAGER")
                                .and().formLogin().permitAll();
    }
}
