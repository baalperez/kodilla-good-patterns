package zadanie13_4;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        // sprawdzenie czy dzia³a informacja o zamawianiu produktu
        int quantity = 1;
        AddressData customerAddressData = new AddressData("Wroclaw", "987654321", "pablo66@wp.pl");
        AddressData foodProducerAddressData = new AddressData("Przedpole", "123456789", "extra_food_shop@wp.pl");
        FoodProducer foodProducer = new FoodProducer("ExtraFoodShop", foodProducerAddressData);
        Customer customer = new Customer(1644, "Adam Nowak", customerAddressData);
        Product product = new Product(123456, "Apple", new BigDecimal("12.29"));
        Order order = new Order(foodProducer, customer, product, quantity);
        order.orderInfo(60);
        System.out.println();

        FoodDataBase foodDataBase = new FoodDataBase();
        System.out.println("Current database:");
        foodDataBase.show();
        System.out.println();

        AddressData newSupplierAddress = new AddressData("Konin", "555555", "superhealthy@gmail.com");
        FoodProducer newSupplier = new FoodProducer("SuperHealthyFood", newSupplierAddress);
        AddNewFoodProducer newFoodProducer = new AddNewFoodProducer();
        newFoodProducer.addToBase(newSupplier.getProducerName());
        System.out.println("Database after adding a new producer: " + newSupplier.getProducerName());
        foodDataBase.afterAdding();
    }
}
