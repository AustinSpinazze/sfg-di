package austinspinazze.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/26/19.
 */
@Service
public class ConstructorGreetingService implements austinspinazze.springframework.sfgdi.services.GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
