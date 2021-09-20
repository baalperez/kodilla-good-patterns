package zadanie13_2;

public class User {

    private final String userLogin;
    private final String userName;
    private final AddressData addressData;

    public User(final String userLogin, final String userName, AddressData addressData) {
        this.userLogin = userLogin;
        this.userName = userName;
        this.addressData = addressData;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserName() {
        return userName;
    }
}
