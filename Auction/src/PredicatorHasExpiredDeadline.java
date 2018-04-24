


import java.time.LocalDateTime;

public class PredicatorHasExpiredDeadline implements Predicate<Trade> {

    LocalDateTime check = LocalDateTime.now();

    @Override
    public boolean test(Trade trade) {
        return trade.getEndTime().isBefore(check);
    }
}

