

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Trade {
    private final String id = UUID.randomUUID().toString();
    private  Rate rate;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
   private final Lot lot;
   private final List<Rate> ratesHistory = new ArrayList<>();

    private Trade trade1;
    public Trade(Lot lot, Rate rate, LocalDateTime startTime, LocalDateTime endTime) {

        this.rate = rate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lot=lot;

    }

    public String getId() {
        return id;
    }

    public Rate getRate() {
        return ratesHistory.get(ratesHistory.size()-1);
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
    public Lot getLot() {
        return lot;
    }

    public List<Rate> getRatesHistory() {
        return ratesHistory;
    }

    public List<Rate> addRate(Rate rate){
        checkTimeOut();
        this.rate = rate;
        ratesHistory.add(rate);
        return ratesHistory;
    }
    public boolean checkTimeOut(){
        if(rate.getCurrentTimeRate().isAfter(endTime)){
            throw new IllegalArgumentException("You are out of time, you should have finished by: "+ endTime + "but now is: " +rate.getCurrentTimeRate());
        }
        return true;
    }
    public UserBuyer checkWinner (){

       int winn = ratesHistory.size()-1;
       Rate Winner = ratesHistory.get(winn);
      UserBuyer Winnerr = Winner.getUserBuyer();
       return Winnerr;

    }
public void withdraw(Trade trade){

//       if(trade.checkTimeOut()){

           UserBuyer winer = trade.checkWinner();
           winer.getAccount().setMoney(winer.getAccount().getMoney()-getRate().getCurrentPrice());
           UserSeller lucky = trade.lot.getUserSeller();
           lucky.getAccount().setMoney(lucky.getAccount().getMoney()+getRate().getCurrentPrice());

//       }
}
    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", currentRate=" + rate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}