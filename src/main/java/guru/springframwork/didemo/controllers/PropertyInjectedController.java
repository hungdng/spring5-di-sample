package guru.springframwork.didemo.controllers;

import guru.springframwork.didemo.services.GreetingService;
import guru.springframwork.didemo.services.GreetingServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImp")
    public GreetingService greetingServiceImp;

    public String sayHello() {
        return greetingServiceImp.sayGreeting();
    }

}
