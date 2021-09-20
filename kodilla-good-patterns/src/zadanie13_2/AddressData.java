package zadanie13_2;

public class AddressData {

    private final String mailAddress;
    private final String homeAddress;
    private final String phoneNumber;

    public AddressData(String mailAddress, String homeAddress, String phoneNumber) {
        this.mailAddress = mailAddress;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
