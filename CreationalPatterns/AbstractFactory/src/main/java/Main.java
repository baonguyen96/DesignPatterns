import factory.IFactory;
import factory.MacFactory;
import factory.WindowsFactory;
import product.IKeyboard;
import product.ITerminal;

public class Main {
    public static void main(String[] args) {
        // normally would only have 1 statically, but implement here for demo
        IFactory[] factories = new IFactory[]{new MacFactory(), new WindowsFactory()};

        for (IFactory factory : factories) {
            System.out.println(factory.getClass());

            IKeyboard keyboard = factory.createKeyboard();
            ITerminal terminal = factory.createTerminal();
            keyboard.printLayout();
            terminal.print();

            System.out.println();
        }
    }
}
