package guru.springframwork.didemo.services;

/**
 * @author HUNGTA on 10/29/17
 * @project di-demo
 */
public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en" :
                return new PrimaryGreetingService(greetingRepository);
            case "de" :
                return new PrimaryGermamGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
