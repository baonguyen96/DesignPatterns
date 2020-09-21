package factory;

import product.IKeyboard;
import product.ITerminal;

public interface IFactory {
    IKeyboard createKeyboard();
    ITerminal createTerminal();
}
