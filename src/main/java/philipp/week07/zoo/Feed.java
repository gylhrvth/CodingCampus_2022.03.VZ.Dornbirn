package philipp.week07.zoo;

public class Feed {
    private String nameFeed;
    private String unitFeed;
    private float unitPrice;

    public Feed(String nameFeed, String unitFeed, float unitPrice) {
        this.nameFeed = nameFeed;
        this.unitFeed = unitFeed;
        this.unitPrice = unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public String getNameFeed() {
        return nameFeed;
    }

    public String getUnitFeed() {
        return unitFeed;

    }
}
