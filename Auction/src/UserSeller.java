import java.util.UUID;

public class UserSeller {

    private final String name;
    private final Account account;


    public UserSeller(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public long getRemainingMoney() {
        return account.getMoney();
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "UserSeller{" +

                ", name='" + name + '\'' +
                '}';
    }

}