package com.example.switching.maintenance._configuration.maintenance;

import org.springframework.context.annotation.Profile;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Profile("maintenance")
@Component
class MaintenanceMatching implements RequestMatcher {

    @Override
    public boolean matches(HttpServletRequest request) {
        String uri = request.getRequestURI();
        if(uri.contains("maintenance")) return false;
        for (MaintenancePath path : MaintenancePage.list()) {
            if(path.matching(uri)) return true;
        }
        return false;
    }
}
