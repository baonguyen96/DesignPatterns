package factory;

import animal.IAnimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalFactoryTest {

    @Test
    void makeAnimalCat() throws Exception {
        IAnimal animal = AnimalFactory.makeAnimal("cat");
        assertEquals("Cat says meow", animal.makeSound());
    }

    @Test
    void makeAnimalTiger() throws Exception {
        IAnimal animal = AnimalFactory.makeAnimal("tiger");
        assertEquals("Tiger roars", animal.makeSound());
    }

    @Test
    void makeAnimalUnknown() {
        assertThrows(Exception.class, () -> AnimalFactory.makeAnimal("lion"));
    }
}