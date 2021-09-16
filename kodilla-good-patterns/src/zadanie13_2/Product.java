package zadanie13_2;

import java.math.BigDecimal;

public class Product {

    private final String product;
    private final String productName;
    private final BigDecimal productPrice;

    public Product(final String product, final String productName, final BigDecimal productPrice) {
        this.product = product;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProduktName() {
        return productName;
    }

    public BigDecimal getProduktPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
