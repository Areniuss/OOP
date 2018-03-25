import java.time.LocalDate;
import java.time.LocalDateTime;

public class Account {
    private final long money;
    private final LocalDateTime dateRegistration;

    public Account(long money, LocalDateTime dateRegistration) {
        if (money < 0) {
            throw new IllegalArgumentException("negative money quantity: " + money);
        }
        this.money = money;
        this.dateRegistration = dateRegistration;
    }

    public long getMoney() {
        return money;
    }

    public LocalDateTime getDateRegistration() {


        return dateRegistration;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", dateRegistration=" + dateRegistration +
                '}';
    }
}