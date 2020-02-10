package root.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RootController {

    @RequestMapping("/")
    public String index() {
        return "Lalala! Greetings from Spring Boot!";
    }

}
