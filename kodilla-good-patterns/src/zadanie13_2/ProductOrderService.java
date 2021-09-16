package zadanie13_2;

public class ProductOrderService {

    public BuyDto process(final Order order) {
        MessageService messageService = new MessageService();
        boolean isBought = order.buy(order.getUser(), order.getProduct(), order.getDateOfPurchase());
        if (isBought) {
            messageService.inform(order.getUser());
            messageService.viewMessage(order);
            return new BuyDto(order.getUser(), true);
        } else {
            messageService.viewMessage(order);
            return new BuyDto(order.getUser(), false);
        }
    }
}
