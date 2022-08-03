package com.brunocorrea.aux;

import org.springframework.stereotype.Controller;
import xyz.brunocorrea.sfgdi.services.GreetingService;

@Controller
public class OutsideController {

    private final GreetingService greetingService;

    public OutsideController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
