package org.example.abstractfactory;

public class LGComputerFactory implements ComputerFactory {
    @Override
    public void createKeyBoard() {
        new LGKeyBoard();
    }

    @Override
    public void createMouse() {
        new LGMouse();
    }
}
