package zadanie13_2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order implements PurchaseService {

    private final User user;
    private final Product product;
    private final LocalDateTime dateOfPurchase;

    public Order(final User user, final Product product, final LocalDateTime dateOfPurchase) {
        this.user = user;
        this.product = product;
        this.dateOfPurchase = dateOfPurchase;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", product=" + product +
                ", dateOfPurchase=" + dateOfPurchase +
                '}';
    }

    @Override
    public boolean buy(final User user, final Product product, final LocalDateTime dateOfPurchase) {
        return user.getUserLogin().length() > 0 && !(BigDecimal.ZERO.compareTo(product.getProduktPrice()) == 0);
    }
}
