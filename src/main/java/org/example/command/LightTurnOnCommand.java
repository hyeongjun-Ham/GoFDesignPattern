package org.example.command;

public class LightTurnOnCommand implements ICommand{

    private Light light;

    public LightTurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
