package behaviour.command;

import behaviour.command.command.Command;

import java.util.Stack;


public class CommandManager {

    private Stack<String> hisotry;

    public CommandManager() {
        this.hisotry = new Stack<>();
    }


    public void executeCommand(Command command){
        hisotry.add(command.execute());
    }

    public void listHistory() {
        while (!hisotry.empty()){
            System.out.println(hisotry.pop());
        }
    }

}
