package factory;

import animal.Cat;
import animal.IAnimal;
import animal.Tiger;

public class AnimalFactory {
    public static IAnimal makeAnimal(String animalType) throws Exception {
        IAnimal animal = null;

        switch (animalType.toLowerCase()){
            case "cat":
                animal = new Cat();
                break;
            case "tiger":
                animal = new Tiger();
                break;
            default:
                throw new Exception("Invalid animal type of " + animalType);
        }

        return animal;
    }
}
