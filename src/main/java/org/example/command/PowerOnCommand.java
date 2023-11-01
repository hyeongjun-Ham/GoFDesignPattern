package org.example.command;

public class PowerOnCommand implements ICommand{
    @Override
    public void execute() {
        System.out.println("power on");
    }
}
