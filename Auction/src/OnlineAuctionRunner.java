import java.time.LocalDateTime;
import java.util.Arrays;

public class OnlineAuctionRunner {

    public static void main(String[] args) {

        Account account1 = new Account(1000, LocalDateTime.now());
        Account account2 = new Account(2000, LocalDateTime.now());
        Account account3 = new Account(2500, LocalDateTime.now());

        UserBuyer userBuyer = new UserBuyer("sergey", account3);
        UserBuyer userBuyer2 = new UserBuyer("Bogdan", account1);
        UserSeller userSeller1 = new UserSeller("Sergey", account3);



        Account account = new Account(1000, LocalDateTime.now());
        System.out.println(account.toString());
        System.out.println(account.getDateRegistration());
        System.out.println(account.getMoney());

        Lot watch = new Lot(userSeller1, "Watch", ProductCategory.ANTIQUES, 1000, "old watch");
        Lot tv = new Lot(userSeller1, "TV", ProductCategory.ELECTRONICS, 1200, "new TV");
        Rate rate = new Rate(1100, userBuyer2, watch, LocalDateTime.now());
        Rate rate1 = new Rate(1200, userBuyer, watch, LocalDateTime.now());
        Rate rate2 = new Rate(1300, userBuyer2, watch, LocalDateTime.now());
        LocalDateTime end = (LocalDateTime.now()).plusMinutes(10);
//        LocalDateTime end = (LocalDateTime.now()).minusMinutes(10);

        Trade trade = new Trade(watch,rate,LocalDateTime.now(),end);
        trade.addRate(rate);

//        System.out.println(trade.checkTimeOut());
        System.out.println(trade);
        trade.addRate(rate1);
        System.out.println(trade);
        trade.addRate(rate2);
        System.out.println();
        System.out.println(trade.getRatesHistory());


        Lots Lots = new Lots();
        Lots.addLot(watch);
        Lots.addLot(tv);
        /*System.out.println(Lots);*/

//        System.out.println(Lots.search(1000,3000));
//        System.out.println(Lots.search(ProductCategory.ELECTRONICS));
//        System.out.println(Lots.search("e"));
//        System.out.println(Lots.searchByNamePart("TV"));








    }


}
