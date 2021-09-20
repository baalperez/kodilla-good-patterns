package zadanie13_4;

public class Customer {

    private final int customerId;
    private final String customerName;
    private final AddressData addressData;

    public Customer(final int customerId, final String customerName, final AddressData addressData) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.addressData = addressData;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public AddressData getAddressData() {
        return addressData;
    }
}
