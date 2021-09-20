package zadanie13_4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodDataBase {

    private final List<Product> productListOfExtraFoodShop = new ArrayList<>();
    private final List<Product> productListOfHealthyShop = new ArrayList<>();
    private final List<Product> productListOfGlutenFreeShop = new ArrayList<>();
    public Map<String, List<Product>> finalMapOfProducersAndTheirProducts = new HashMap<>();
    AddNewFoodProducer addNewFoodProducer = new AddNewFoodProducer();

    FoodDataBase() {
        // HealthyShop
        Product product1001 = new Product(1001, "Potato", new BigDecimal("2.99"));
        Product product1002 = new Product(1002, "Beetroot", new BigDecimal("4.99"));
        Product product1003 = new Product(1003, "Tomato", new BigDecimal("5.99"));
        Product product1004 = new Product(1004, "Lettuce", new BigDecimal("7.99"));
        productListOfHealthyShop.add(product1001);
        productListOfHealthyShop.add(product1002);
        productListOfHealthyShop.add(product1003);
        productListOfHealthyShop.add(product1004);

        // GlutenFreeShop
        Product product2001 = new Product(2001, "Cheese", new BigDecimal("2.99"));
        Product product2002 = new Product(2002, "Milk", new BigDecimal("1.99"));
        Product product2003 = new Product(2003, "Bread", new BigDecimal("5.99"));
        Product product2004 = new Product(2004, "Roll", new BigDecimal("0.99"));
        productListOfGlutenFreeShop.add(product2001);
        productListOfGlutenFreeShop.add(product2002);
        productListOfGlutenFreeShop.add(product2003);
        productListOfGlutenFreeShop.add(product2004);

        // ExtraFoodShop
        Product product3001 = new Product(3001, "Apple", new BigDecimal("12.29"));
        Product product3002 = new Product(3002, "Pear", new BigDecimal("11.99"));
        Product product3003 = new Product(3003, "Plum", new BigDecimal("5.99"));
        Product product3004 = new Product(3004, "Strawberry", new BigDecimal("7.99"));
        productListOfExtraFoodShop.add(product3001);
        productListOfExtraFoodShop.add(product3002);
        productListOfExtraFoodShop.add(product3003);
        productListOfExtraFoodShop.add(product3004);

        mapOfProducts();
    }

    public Map<String, List<Product>> mapOfProducts() {
        finalMapOfProducersAndTheirProducts.put("HealthyShop", productListOfHealthyShop);
        finalMapOfProducersAndTheirProducts.put("GlutenFreeShop", productListOfGlutenFreeShop);
        finalMapOfProducersAndTheirProducts.put("ExtraFoodShop", productListOfExtraFoodShop);
        return finalMapOfProducersAndTheirProducts;
    }

    public void afterAdding() {
        if (addNewFoodProducer.addToBase(addNewFoodProducer.getName())) {
            FoodProducer foodProducer = new FoodProducer();
            System.out.println("New producer added succesfully to database.");
            finalMapOfProducersAndTheirProducts.put(addNewFoodProducer.getName(), addNewFoodProducer.newProducerProductList);
            System.out.println(finalMapOfProducersAndTheirProducts);
        } else {
            System.out.println("Failed to add a new producer to database.");
        }
    }

    public void show() {
        System.out.println(finalMapOfProducersAndTheirProducts);
    }

    @Override
    public String toString() {
        return "FoodDataBase{" +
                "finalMapOfProducersAndTheirProducts=" + finalMapOfProducersAndTheirProducts +
                '}';
    }
}
