package behaviour.command.command;

import behaviour.command.service.OrderService;

public class OrderStatusCommand implements Command {

    private final OrderService orderService;
    private final String order;

    public OrderStatusCommand(OrderService orderService, String order) {
        this.orderService = orderService;
        this.order = order;
    }

    @Override
    public String execute() {
        return this.orderService.getStatus(this.order);
    }
}
