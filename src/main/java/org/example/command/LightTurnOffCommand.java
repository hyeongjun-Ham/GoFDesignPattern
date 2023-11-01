package org.example.command;

public class LightTurnOffCommand implements ICommand {

    private Light light;

    public LightTurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
