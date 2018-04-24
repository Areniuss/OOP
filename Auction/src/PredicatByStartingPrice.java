public class PredicatByStartingPrice implements Predicate<Lot> {
    private int min;
    private int max;

    public PredicatByStartingPrice(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public boolean test(Lot lot) {


        return lot.getStartingPrice() >= min && lot.getStartingPrice() <= max;


    }
}
