package com.example.switching.maintenance._configuration.maintenance;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Profile("maintenance")
@Component
class UnderMaintenanceFilter extends MaintenanceFilter {

    MaintenanceMatching matching;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if(matching.matches(request)) {
            response.sendRedirect("/maintenance");
            return;
        }
        filterChain.doFilter(request, response);
    }

    UnderMaintenanceFilter(MaintenanceMatching matching) {
        this.matching = matching;
    }
}
