package behaviour.command.command;

import behaviour.command.service.ReturnSerivce;

public class ReturnCommand implements Command{

    private ReturnSerivce returnSerivce;
    private String order;

    public ReturnCommand(ReturnSerivce returnSerivce, String order) {
        this.returnSerivce = returnSerivce;
        this.order = order;
    }

    @Override
    public String execute() {
        return returnSerivce.initiateReturn(order);
    }
}
