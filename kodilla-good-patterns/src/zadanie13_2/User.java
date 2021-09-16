package zadanie13_2;

public class User {

    private final String userLogin;
    private final String userName;
    private final String mailAddress;
    private final String homeAddress;
    private final String phoneNumber;

    public User(final String userLogin, final String userName, final String mailAddress,
                final String homeAddress, final String phoneNumber) {
        this.userLogin = userLogin;
        this.userName = userName;
        this.mailAddress = mailAddress;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserName() {
        return userName;
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

    @Override
    public String toString() {
        return "User{" +
                "userLogin='" + userLogin + '\'' +
                ", userName='" + userName + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
