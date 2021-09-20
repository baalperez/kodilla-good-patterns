package zadanie13_4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AddNewFoodProducer {

    public List<Product> newProducerProductList = new ArrayList<>();
    public Map<String, List<Product>> newProducerProductsMap = new HashMap<>();
    private String name = "";

    public String getName() {
        return name;
    }

    AddNewFoodProducer() {
        // New producer and his products
        Product product100001 = new Product(100001, "Onion", new BigDecimal("2.99"));
        Product product100002 = new Product(100002, "Celery", new BigDecimal("4.99"));
        Product product100003 = new Product(100003, "Carrot", new BigDecimal("5.99"));
        Product product100004 = new Product(100004, "Parsley", new BigDecimal("7.99"));
        newProducerProductList.add(product100001);
        newProducerProductList.add(product100002);
        newProducerProductList.add(product100003);
        newProducerProductList.add(product100004);

        newProducerProductsMap.put(name, newProducerProductList);
    }

    public boolean addToBase(String name) {
        this.name = name;
        return name != null;
    }
}
