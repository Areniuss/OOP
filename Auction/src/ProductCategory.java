

public enum ProductCategory {


    TECHNIQUE(1), ANTIQUES(2), ELECTRONICS(3), OTHER(4);

    private final int id;

    ProductCategory(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static String getClassName() { // TODO: ?
        return ProductCategory.class.getName();
    }
}
