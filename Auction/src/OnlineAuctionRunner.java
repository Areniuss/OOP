import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OnlineAuctionRunner {

    public static void main(String[] args) {

        Account account1 = new Account(2000, LocalDateTime.now());
        Account account2 = new Account(2000, LocalDateTime.now());
        Account account3 = new Account(2000, LocalDateTime.now());

        UserBuyer userBuyer = new UserBuyer("sergey", account3);
        UserBuyer userBuyer2 = new UserBuyer("Bogdan", account1);
        UserSeller userSeller1 = new UserSeller("Sergey", account3);


        Account account = new Account(1000, LocalDateTime.now());
//        System.out.println(account.toString());
//        System.out.println(account.getDateRegistration());
//        System.out.println(account.getMoney());

        Lot watch = new Lot(userSeller1, "Watch", ProductCategory.ANTIQUES, 1000, "old watch");
        Lot tv = new Lot(userSeller1, "TV", ProductCategory.ELECTRONICS, 1200, "new TV");
        Rate rate = new Rate(1100, userBuyer2, watch, LocalDateTime.now());
        Rate rate1 = new Rate(1200, userBuyer, watch, LocalDateTime.now());
        Rate rate2 = new Rate(1300, userBuyer2, watch, LocalDateTime.now());
        LocalDateTime end = (LocalDateTime.now()).plusMinutes(10);
//        LocalDateTime end = (LocalDateTime.now()).minusMinutes(10);

        Trade trade = new Trade(watch, rate, LocalDateTime.now(), end);
        Trade trade1 = new Trade(tv, rate2, LocalDateTime.now(), end);
        trade.addRate(rate);

//        System.out.println(trade.checkTimeOut());
//        System.out.println(trade);
        trade.addRate(rate1);
//        System.out.println(trade);
//        trade.addRate(rate2);
//        System.out.println();
//        System.out.println(trade.getRatesHistory());


        Lots Lots = new Lots();
        Lots.addLot(watch);
        Lots.addLot(tv);
        /*System.out.println(Lots);*/
//        System.out.println();
//        UserBuyer winer = trade.checkWinner();
//        System.out.println(winer);
//        trade.withdraw(trade);
//        System.out.println(userSeller1.getRemainingMoney());
//        System.out.println(userBuyer2.getRemainingMoney());
//        System.out.println(Lots.search(1000,3000));
//        System.out.println(Lots.search(ProductCategory.ELECTRONICS));
//        System.out.println(Lots.search("e"));
//        System.out.println(Lots.searchByNamePart("TV"));
        String s = "sd";
        Lots result = Lots.filter(new PredicateNameContains("T"));
//        System.out.println(result);
        Lots result2 = Lots.filter(new PredicatByStartingPrice(1000, 1300));
//        System.out.println(result2);
        Trades tradess = new Trades();

        tradess.addtrade(trade);
        tradess.addtrade(trade1);

        Trades result3 = tradess.filter(new PredicatorHasExpiredDeadline());
        System.out.println(result3);

        tradess.sort(ComparatorsForAuction.byDeadline());
        for (Trade t : tradess.getTrades()
                ) {
            System.out.println(t);
        }

        Lots.sort(ComparatorsForAuction.byName());
        for (Lot t : Lots.getLots()
                ) {
            System.out.println(t);

        }


    }


}
