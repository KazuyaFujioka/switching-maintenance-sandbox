package com.example.switching.maintenance.presentation.anything;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("anything")
class AnythingController {

    @GetMapping("")
    String index() {
        return "anything/index";
    }

}
