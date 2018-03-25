

import java.util.ArrayList;
import java.util.List;

public class Lots {

    private final List<Lot> lots = new ArrayList<>();

    public void addLot(Lot lot) {
        lots.add(lot);
    }

    public List<Lot> getLots() {
        return lots;
    }
}
