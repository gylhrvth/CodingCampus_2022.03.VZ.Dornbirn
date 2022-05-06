package zah.week07;

public class Feed {
    private String name;
    private int unit;
    private int unitPrice;

    public Feed(String name, int unit, int unitPrice) {
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public int getUnit() {
        return unit;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public void setEinheitsPreis(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
