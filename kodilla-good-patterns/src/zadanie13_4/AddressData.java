package zadanie13_4;

public class AddressData {

    private final String homeAddress;
    private final String phoneNumber;
    private final String mailAddress;

    public AddressData(final String homeAddress, final String phoneNumber, final String mailAddress) {
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.mailAddress = mailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

}
