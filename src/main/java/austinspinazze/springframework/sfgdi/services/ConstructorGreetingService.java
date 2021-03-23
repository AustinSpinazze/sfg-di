package austinspinazze.springframework.sfgdi.services;


public class ConstructorGreetingService implements austinspinazze.springframework.sfgdi.services.GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
