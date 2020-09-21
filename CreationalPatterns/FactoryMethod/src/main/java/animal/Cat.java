package animal;

public class Cat implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Cat says meow");
    }
}
