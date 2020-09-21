import factory.OsFactory;
import factory.MacOsFactory;
import factory.WindowsOsFactory;
import product.IKeyboard;
import product.ITerminal;

public class Main {
    public static void main(String[] args) {
        // normally would only have 1 statically, but implement here for demo
        OsFactory[] factories = new OsFactory[]{new MacOsFactory(), new WindowsOsFactory()};

        for (OsFactory factory : factories) {
            System.out.println(factory.getClass());

            IKeyboard keyboard = factory.createKeyboard();
            ITerminal terminal = factory.createTerminal();
            keyboard.printLayout();
            terminal.print();

            System.out.println();
        }
    }
}
