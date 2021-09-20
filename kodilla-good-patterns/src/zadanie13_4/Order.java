package zadanie13_4;

import java.math.BigDecimal;

public class Order {

    private final FoodProducer foodProducer;
    private final Customer customer;
    private final Product product;
    private final int quantity;

    public Order(final FoodProducer foodProducer, final Customer customer, final Product product, final int quantity) {
        this.foodProducer = foodProducer;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public void orderInfo(int quantity) {
        if (foodProducer.process()) {
            System.out.println("Customer: " + customer.getCustomerName() + ", ordered: " + product.getProductName() +
                    " in an amount: " + quantity + ", in total price: " + totalPrice(quantity));
            System.out.println("Food producer: " + foodProducer.getProducerName() + ", will send " + product.getProductName() +
                    " to customerID: " + customer.getCustomerId());
        }
    }

    public BigDecimal totalPrice(int quantity) {
        return product.getProductPrice().multiply(BigDecimal.valueOf(quantity));
    }

}
