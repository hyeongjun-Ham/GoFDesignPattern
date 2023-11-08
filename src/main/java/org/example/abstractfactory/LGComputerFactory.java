package org.example.abstractfactory;

public class LGComputerFactory implements ComputerFactory {
    @Override
    public KeyBoard createKeyBoard() {
        return new LGKeyBoard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}
