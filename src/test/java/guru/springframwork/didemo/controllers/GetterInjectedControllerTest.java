package guru.springframwork.didemo.controllers;

import guru.springframwork.didemo.services.GreetingService;
import guru.springframwork.didemo.services.GreetingServiceImp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {
    private GetterInjectedController getterInjectedController;

    @Before
    public void Setup() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImp());
    }

    @Test
    public void test() throws Exception {
        assertEquals(GreetingServiceImp.HELLO_GURUS, getterInjectedController.sayHello());
    }
}
