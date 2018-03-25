import java.time.LocalDateTime;
import java.util.Arrays;

public class OnlineAuctionRunner {

    public static void main(String[] args) {

        Account account1 = new Account(1000, LocalDateTime.now());
        Account account2 = new Account(2000, LocalDateTime.now());

        UserBuyer userBuyer = new UserBuyer("Max", account1);
        UserSeller userSeller = new UserSeller("Sergey", account2);


        Account account = new Account(1000, LocalDateTime.now());
        System.out.println(account.toString());
        System.out.println(account.getDateRegistration());
        System.out.println(account.getMoney());

        Lot watch = new Lot(userSeller, "Watch", ProductCategory.antiques, 1000, "old watch");
        Rate rate = new Rate(999, userBuyer, watch);
        LocalDateTime end = (LocalDateTime.now()).plusMinutes(10);

        Trade trade = new Trade(watch,rate,LocalDateTime.now(),end);







    }


}
