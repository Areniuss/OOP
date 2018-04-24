import java.util.Comparator;

public class ByNameComparator implements Comparator<Lot> {
    @Override
    public int compare(Lot o1, Lot o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
