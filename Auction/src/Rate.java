import java.time.LocalDateTime;

public class Rate {
    private long currentPrice;
    private final UserBuyer userBuyer;
    private LocalDateTime currentTimeRate;
    Lot lot;
    public long getCurrentPrice() {
        return currentPrice;
    }

    public UserBuyer getUserBuyer() {
        return userBuyer;
    }

    public LocalDateTime getCurrentTimeRate() {
        return currentTimeRate;
    }

    public Rate(long currentPrice, UserBuyer userBuyer, Lot lot) {
        this.currentPrice = currentPrice;
        this.userBuyer = userBuyer;
        this.lot = lot;

    }


public long changeCurrentPrice(long newRate) {

        if (newRate <= currentPrice || newRate<= lot.getStartingPrice()) {
            throw new IllegalArgumentException("Rate is smaller then needed: " + newRate);
        }


        currentPrice = newRate;


    return newRate;
}

    @Override
    public String toString() {
        return "Rate{" +
                "currentPrice=" + currentPrice +
                ", userBuyer=" + userBuyer +
                '}';
    }
}