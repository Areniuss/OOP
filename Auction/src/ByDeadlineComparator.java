import java.util.Comparator;

public class ByDeadlineComparator implements Comparator<Trade> {

    @Override
    public int compare(Trade o1, Trade o2) {
        return o1.getEndTime().compareTo(o2.getEndTime());
    }
}
