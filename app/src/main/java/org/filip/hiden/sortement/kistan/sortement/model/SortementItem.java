package org.filip.hiden.sortement.kistan.sortement.model;

/**
 * Created by fhiden on 2017-03-14.
 */

public class SortementItem {
    private String  name;
    
    private String  type;
    private double  price;
    private String  unit;

    public SortementItem(String name, String type, double price, String unit){
        this.name = name;
        this.type = type;
        this.price = price;
        this.unit = unit;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
