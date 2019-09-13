package io.leche43.greetings.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String greeting(String name) {
        return "hello " + name + "\n";
    }
}
