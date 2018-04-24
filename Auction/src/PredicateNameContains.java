public class PredicateNameContains implements Predicate<Lot> {

    private String substring;

    public PredicateNameContains(String substring) {
        this.substring = substring;
    }

    @Override
    public boolean test(Lot lot) {
        return lot.getName().contains(substring);
    }
}
