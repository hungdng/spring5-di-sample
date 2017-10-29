package guru.springframwork.didemo.controllers;

import guru.springframwork.didemo.services.GreetingServiceImp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private  PropertyInjectedController propertyInjectedController;

    @Before
    public void Setup() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImp = new GreetingServiceImp();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImp.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}
