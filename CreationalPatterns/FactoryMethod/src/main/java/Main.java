import animal.IAnimal;
import factory.AnimalFactory;

public class Main {
    public static void main(String[] args) {
        try {
            IAnimal animal = AnimalFactory.makeAnimal("cat");
            System.out.println(animal.makeSound());

            animal = AnimalFactory.makeAnimal("tiger");
            System.out.println(animal.makeSound());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
