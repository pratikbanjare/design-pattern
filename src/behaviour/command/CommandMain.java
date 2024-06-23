package behaviour.command;

import behaviour.command.command.Command;
import behaviour.command.command.OrderStatusCommand;
import behaviour.command.command.ReturnCommand;
import behaviour.command.service.OrderService;
import behaviour.command.service.ReturnSerivce;

public class CommandMain {

    public static void main(String[] args) {

        CommandManager commandManager = new CommandManager();

        Command orderCommand = new OrderStatusCommand(new OrderService(),"iphone 15");
        Command returnCommand = new ReturnCommand(new ReturnSerivce(), "iphone 14");

        commandManager.executeCommand(orderCommand);
        commandManager.executeCommand(returnCommand);

        commandManager.listHistory();

    }
}
