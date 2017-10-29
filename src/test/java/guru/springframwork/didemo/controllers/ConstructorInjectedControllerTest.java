package guru.springframwork.didemo.controllers;

import guru.springframwork.didemo.services.GreetingServiceImp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController contructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.contructorInjectedController = new ConstructorInjectedController(new GreetingServiceImp());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImp.HELLO_GURUS, this.contructorInjectedController.sayHello());
    }
}
