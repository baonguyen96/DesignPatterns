package factory;

import product.IKeyboard;
import product.MacKeyboard;
import product.MacTerminal;
import product.ITerminal;

public class MacOsFactory implements OsFactory {
    public IKeyboard createKeyboard() {
        return new MacKeyboard();
    }

    public ITerminal createTerminal() {
        return new MacTerminal();
    }
}
