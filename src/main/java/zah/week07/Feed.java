package zah.week07;

import java.util.HashMap;

public class Feed {
    private String name;
    private String unit;
    private int unitPrice;


    public Feed(String name, String unit, int unitPrice) {
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
