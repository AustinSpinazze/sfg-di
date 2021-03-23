package austinspinazze.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("cat")
public class CatPetService implements austinspinazze.springframework.sfgdi.services.PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
