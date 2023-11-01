package org.example.command;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        LightTurnOnCommand lightTurnOnCommand = new LightTurnOnCommand(light);
        LightTurnOffCommand lightTurnOffCommand = new LightTurnOffCommand(light);

        PowerOnCommand powerOnCommand = new PowerOnCommand();

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(lightTurnOnCommand);
        remoteControl.addCommand(lightTurnOffCommand);
        remoteControl.addCommand(powerOnCommand);

        remoteControl.execute(0); // turn on
        remoteControl.execute(1); // turn off
        remoteControl.execute(2); // power on
    }

}
