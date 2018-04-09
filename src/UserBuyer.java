

import java.util.UUID;

public class UserBuyer {

    private final String name;
    private final Account account;


    public UserBuyer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public long getRemainingMoney() {
        return account.getMoney();
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "UserBuyer{" +

                ", name='" + name + '\'' +
                '}';
    }

}
