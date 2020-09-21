package factory;

import product.IKeyboard;
import product.ITerminal;
import product.WindowsKeyboard;
import product.WindowsTerminal;

public class WindowsOsFactory implements OsFactory {
    public IKeyboard createKeyboard() {
        return new WindowsKeyboard();
    }

    public ITerminal createTerminal() {
        return new WindowsTerminal();
    }
}
