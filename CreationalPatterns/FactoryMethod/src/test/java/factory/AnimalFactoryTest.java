package factory;

import animal.IAnimal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalFactoryTest {

    @Test
    public void makeAnimalCat() throws Exception {
        IAnimal animal = AnimalFactory.makeAnimal("cat");
        assertEquals("Cat says meow", animal.makeSound());
    }

    @Test
    public void makeAnimalTiger() throws Exception {
        IAnimal animal = AnimalFactory.makeAnimal("tiger");
        assertEquals("Tiger roars", animal.makeSound());
    }

    @Test(expected = Exception.class)
    public void makeAnimalUnknown() throws Exception {
        AnimalFactory.makeAnimal("lion");
    }
}