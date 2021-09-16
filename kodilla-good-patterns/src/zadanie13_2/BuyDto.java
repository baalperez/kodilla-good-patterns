package zadanie13_2;

public class BuyDto {

    public User user;
    public boolean isBought;

    public BuyDto(User user, boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }
}
