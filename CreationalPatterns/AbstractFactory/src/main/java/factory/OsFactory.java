package factory;

import product.IKeyboard;
import product.ITerminal;

public interface OsFactory {
    IKeyboard createKeyboard();
    ITerminal createTerminal();
}
