package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Pet> pets = new ArrayList<>();

    public void add(Pet pet){
        if(!areEquals(pet))
        pets.add(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }

    public boolean areEquals(Pet pet){
        for (Pet puppy: pets) {
            if(puppy.getRegistrationNumber().equals(pet.getRegistrationNumber())){
                return true;
            }
        }
        return false;
    }


}
