package org.microservice.greeting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
 
 
    @RequestMapping("greeting/{name}")
        public Greeting greeting(@PathVariable("name") String name) {
            return new Greeting("Hello, ".concat(name));
        }
    @RequestMapping("/")
    public Greeting greeting() {
        return new Greeting("Hello world.");
    }
}
