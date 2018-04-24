import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Trades {
    private final List<Trade> trades = new ArrayList<>();

    public void sort(Comparator<Trade> comparator) {
        trades.sort(comparator);
    }

    public void addtrade(Trade trade) {
        trades.add(trade);
    }

    public List<Trade> getTrades() {
        return trades;
    }

    public Trades filter(Predicate<Trade> predicate) {
        Trades test = new Trades();
        for (Trade t : trades
                ) {
            if (predicate.test(t)) {
                test.addtrade(t);
            }


        }
        return test;
    }

    @Override
    public String toString() {
        return "Trades{" +
                "trades=" + trades +
                '}';
    }
}
