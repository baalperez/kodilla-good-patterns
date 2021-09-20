package zadanie13_2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {

        AddressData address = new AddressData("pablo66@wp.pl", "Home Address", "123456789");
        User user = new User("pablo66", "Pawe³ Nowak", address);
        Product product = new Product("162544", "Big doll", new BigDecimal("11.55"));
        LocalDateTime dateOfPurchase = LocalDateTime.of(2017, 8, 16, 12, 0);

        ProductOrderService productOrderService = new ProductOrderService();
        Order order = new Order(user, product, dateOfPurchase);
        productOrderService.process(order);
    }
}