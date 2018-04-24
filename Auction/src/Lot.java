import java.util.UUID;

public class Lot {
    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final ProductCategory category;
    private final long startingPrice;
    /*private final long currentPrice;*/
    private final String description;
    private final UserSeller userSeller;

    public Lot(UserSeller userSeller, String name, ProductCategory category, long startingPrice /*long currentPrice*/, String description) {

        this.name = name;
        this.category = category;
        this.startingPrice = startingPrice;
        /* this.currentPrice = currentPrice;*/
        this.description = description;
        this.userSeller = userSeller;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public long getStartingPrice() {
        return startingPrice;
    }

 /*   public long getCurrentPrice() {
        return currentPrice;
    }*/

    public String getDescription() {
        return description;
    }

    public UserSeller getUserSeller() {
        return userSeller;
    }

    @Override
    public String toString() {
        return "Lot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", startingPrice=" + startingPrice +
                /*", currentPrice=" + currentPrice +*/
                ", description='" + description + '\'' +
                '}';
    }
}