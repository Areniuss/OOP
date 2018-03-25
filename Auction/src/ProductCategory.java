

public enum ProductCategory {

    technique(1), antiques(2), electronics(3), other(4);

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
