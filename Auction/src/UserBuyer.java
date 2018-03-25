

import java.util.UUID;

public class UserBuyer {
    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final Account account;


    public UserBuyer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public long getRemainingMoney() {
        return account.getMoney();
    }

    @Override
    public String toString() {
        return "UserBuyer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
