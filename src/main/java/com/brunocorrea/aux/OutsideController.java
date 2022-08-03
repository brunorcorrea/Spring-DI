package com.brunocorrea.aux;

import xyz.brunocorrea.sfgdi.services.GreetingService;

public class OutsideController {

    private final GreetingService greetingService;

    public OutsideController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
