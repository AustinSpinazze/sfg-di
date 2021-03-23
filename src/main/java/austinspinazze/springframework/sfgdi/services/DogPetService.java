package austinspinazze.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service
public class DogPetService implements austinspinazze.springframework.sfgdi.services.PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
