package org.example.command;

import java.util.ArrayList;
import java.util.List;

//invoker Class
public class RemoteControl {

    private final List<ICommand> commandList = new ArrayList<>();

    public void addCommand(ICommand command) {
        commandList.add(command);
    }

    public void execute(int index) {
        if (index >= 0 && index < commandList.size()) {
            commandList.get(index).execute();
        }
    }
}
