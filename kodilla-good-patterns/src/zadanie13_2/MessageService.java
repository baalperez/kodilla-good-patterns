package zadanie13_2;

public class MessageService implements InformationService {

    public void viewMessage(Order order) {
        if (order.buy(order.getUser(), order.getProduct(), order.getDateOfPurchase())) {
            System.out.println("User '" + order.getUser().getUserLogin() + "' purchased '" +
                    order.getProduct().getProduktName() + "' for " +
                    order.getProduct().getProduktPrice() + "\u20ac" +
                    " on " + order.getDateOfPurchase());
        } else {
            System.out.println("The purchase has been rejected!");
        }
    }

    @Override
    public void inform(User user) {
        System.out.println("Sending message to: '" + user.getUserLogin() + "'.");
    }
}
