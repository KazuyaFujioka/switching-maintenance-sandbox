package com.example.switching.maintenance.presentation.maintenance;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Profile("maintenance")
@Controller
@RequestMapping("maintenance")
class MaintenanceController {

    @GetMapping("")
    String maintenance() {
        return "maintenance";
    }
}
