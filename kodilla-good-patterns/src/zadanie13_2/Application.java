package zadanie13_2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {

        User user = new User("pablo66", "Pawe³ Nowak", "pablo66@wp.pl",
                "44-370 Pszów, ul. Roweckiego 16", "660565565");
        Product product = new Product("162544", "Big doll", new BigDecimal("12.55"));
        LocalDateTime dateOfPurchase = LocalDateTime.of(2017, 8, 16, 12, 0);

        ProductOrderService productOrderService = new ProductOrderService();
        Order order = new Order(user, product, dateOfPurchase);
        productOrderService.process(order);
    }
}