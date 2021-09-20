package zadanie13_4;

public class FoodProducer implements Distributable {

    private String producerName = "";
    private AddressData addressData = null;

    public FoodProducer() {
    }

    public FoodProducer(final String producerName, final AddressData addressData) {
        this.producerName = producerName;
        this.addressData = addressData;
    }

    public String getProducerName() {
        return producerName;
    }

    public AddressData getAddressData() {
        return addressData;
    }

    @Override
    public boolean process() {
        return true;
    }
}
