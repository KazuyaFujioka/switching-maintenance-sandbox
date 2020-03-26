package com.example.switching.maintenance._configuration;

import com.example.switching.maintenance._configuration.maintenance.MaintenanceFilter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@EnableWebSecurity
class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    MaintenanceFilter maintenanceFilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/maintenance").permitAll()
                .anyRequest().authenticated()
            .and()
                .formLogin().permitAll()
            .and()
                .addFilterBefore(maintenanceFilter, BasicAuthenticationFilter.class);
    }

    WebSecurityConfiguration(MaintenanceFilter maintenanceFilter) {
        this.maintenanceFilter = maintenanceFilter;
    }
}
