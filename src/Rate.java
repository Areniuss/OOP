import java.time.LocalDateTime;

public class Rate {
    private long currentPrice;
    private final UserBuyer userBuyer;
    private LocalDateTime currentTimeRate;
    private final Lot lot;


    public UserBuyer getUserBuyer() {
        return userBuyer;
    }

    public LocalDateTime getCurrentTimeRate() {
        return currentTimeRate;
    }

    public Rate(long currentPrice, UserBuyer userBuyer, Lot lot, LocalDateTime currentTimeRate) {
        this.currentPrice = currentPrice;
        this.userBuyer = userBuyer;
        this.lot = lot;
        this.currentTimeRate = currentTimeRate;

    }

    public Lot getLot() {
        return lot;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public long changeCurrentPrice(long newRate) {
        if (checkBuyerNotSeller(userBuyer)) {
            throw new IllegalArgumentException("buyer not seller");
        }
        ;
        if (newRate <= currentPrice || newRate <= lot.getStartingPrice()) {
            throw new IllegalArgumentException("Rate is smaller then needed: " + newRate);
        }


        currentPrice = newRate;


        return newRate;
    }

    public boolean checkBuyerNotSeller(UserBuyer userBuyer) {
        boolean check = false;
        if (userBuyer.getAccount().getId().equals(lot.getUserSeller().getAccount().getId())) {
            return true;
        }

        return check;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "currentPrice=" + currentPrice +
                ", userBuyer=" + userBuyer +
                '}';
    }
}