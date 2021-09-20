package zadanie13_4;

import java.math.BigDecimal;

public class Product {

    private final int productId;
    private final String productName;
    private final BigDecimal productPrice;

    public Product(final int productId, final String productName, final BigDecimal productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
