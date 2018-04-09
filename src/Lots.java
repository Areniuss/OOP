

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Lots {

    private final List<Lot> lots = new ArrayList<>();

    public void addLot(Lot lot) {
        lots.add(lot);
    }

    public List<Lot> getLots() {
        return lots;
    }

    public List<Lot> searchByNamePart(String Productname) {
        String test = Productname.toUpperCase();
        List<Lot> result = new ArrayList<>();
        for (Lot lot : lots) {
            Lot test1 = lot;
            String testname = test1.getName().toUpperCase();
            if (testname.contains(test)) {
                result.add(lot);
            }

        }
        if(result.isEmpty()){
            throw new IllegalArgumentException("no lots found :( ");//TODO нужна ли эта проверка?
        }

        return result;
    }
    public List<Lot> search(ProductCategory category) {
        ProductCategory test = category;
        List<Lot> result = new ArrayList<>();
        for (Lot lot : lots) {
            Lot test1 = lot;
            ProductCategory testname = test1.getCategory();
            if (testname.equals(test)) {
                result.add(lot);
            }

        }
        if(result.isEmpty()){
            throw new IllegalArgumentException("no lots found :( ");//TODO нужна ли эта проверка?
        }

        return result;
    }
    public List<Lot> search(long start, long end) { //TODO правильна ли реализация этого метода или что то можно добавить?

        List<Lot> result = new ArrayList<>();
        for (Lot lot : lots) {


            if (lot.getStartingPrice()>=start && lot.getStartingPrice()<=end) {
                result.add(lot);
            }

        }
        if(result.isEmpty()){
            throw new IllegalArgumentException("no lots found :( ");//TODO нужна ли эта проверка?
        }

        return result;
    }
    public List<Lot> search(String Username) {
        String test = Username.toUpperCase();
        List<Lot> result = new ArrayList<>();
        for (Lot lot : lots) {
            Lot test1 = lot;
            String testname = test1.getUserSeller().getName().toUpperCase();
            if (testname.contains(test)) {
                result.add(lot);
            }

        }
        if(result.isEmpty()){
            throw new IllegalArgumentException("no user sellers found :( ");//TODO нужна ли эта проверка?
        }

        return result;
    }

    @Override
    public String toString() {
        return "Lots{" +
                "lots=" + lots +
                '}';
    }
}
