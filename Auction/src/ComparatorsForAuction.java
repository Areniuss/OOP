import java.util.Comparator;

public class ComparatorsForAuction {
    public static Comparator<Lot> byName() {
        return new ByNameComparator();
    }

    public static Comparator<Trade> byDeadline() {
        return new ByDeadlineComparator();
    }
}
