package com.example.switching.maintenance.presentation.something;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("something")
class SomethingController {

    @GetMapping("")
    String index() {
        return "something/index";
    }

    @GetMapping("doSomething")
    String doSomething() {
        return "something/something";
    }
}
