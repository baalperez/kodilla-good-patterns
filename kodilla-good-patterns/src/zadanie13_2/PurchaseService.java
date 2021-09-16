package zadanie13_2;

import java.time.LocalDateTime;

public interface PurchaseService {

    boolean buy(User user, Product product, LocalDateTime dateOfPurchase);
}
