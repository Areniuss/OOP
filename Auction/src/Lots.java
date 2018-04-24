


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Lots {

    private final List<Lot> lots = new ArrayList<>();

    public void sort(Comparator<Lot> comparator) {
        lots.sort(comparator);
    }

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
            String testname = lot.getName().toUpperCase();
            if (testname.contains(test)) {
                result.add(lot);
            }

        }


        return result;
    }

    public List<Lot> search(ProductCategory category) {
        List<Lot> result = new ArrayList<>();
        for (Lot lot : lots) {
            ProductCategory testname = lot.getCategory();
            if (testname.equals(category)) {
                result.add(lot);
            }

        }


        return result;
    }

    public List<Lot> search(long start, long end) { //

        List<Lot> result = new ArrayList<>();
        for (Lot lot : lots) {


            if (lot.getStartingPrice() >= start && lot.getStartingPrice() <= end) {
                result.add(lot);
            }

        }


        return result;
    }

    public List<Lot> search(String Username) {
        String test = Username.toUpperCase();
        List<Lot> result = new ArrayList<>();
        for (Lot lot : lots) {
            String testname = lot.getUserSeller().getName().toUpperCase();
            if (testname.contains(test)) {
                result.add(lot);
            }

        }

        return result;
    }

    public Lots filter(Predicate<Lot> predicate) {
        Lots test = new Lots();
        for (Lot t : lots
                ) {
            if (predicate.test(t)) {
                test.addLot(t);
            }


        }
        return test;
    }

    @Override
    public String toString() {
        return "Lots{" +
                "lots=" + lots +
                '}';
    }
}
