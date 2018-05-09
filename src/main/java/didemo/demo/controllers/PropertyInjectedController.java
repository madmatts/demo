package didemo.demo.controllers;

import didemo.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl; // Field name is like bean name which specifies implementation by a reflection instead of using Qualifier annotation

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
