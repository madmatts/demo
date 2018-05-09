package didemo.demo.controllers;

import didemo.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterGreetingService") // Qualifier can be used the same way as in constructor injected controller
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
