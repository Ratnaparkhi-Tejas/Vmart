package org.example;

public class Item {
    String Name;
    String Company;
    int itemId;
    String type;
    boolean refrigerationRequired;
    int stockOnBin;
    int stockInWarehouse;
    float weight;
    String dimensions;
    float price;
//=======================Getters and setters========================================
    public String getDimensions() {
        return dimensions;
    }

    public int getStockInWarehouse() {
        return stockInWarehouse;
    }

    public void setStockInWarehouse(int stockInWarehouse) {
        this.stockInWarehouse = stockInWarehouse;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getStockOnBin() {
        return stockOnBin;
    }

    public void setStockOnBin(int stockOnBin) {
        this.stockOnBin = stockOnBin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isRefrigerationRequired() {
        return refrigerationRequired;
    }

    public void setRefrigerationRequired(boolean refrigerationRequired) {
        this.refrigerationRequired = refrigerationRequired;
    }
    //===========================Get and set end========================================================
    //-----------------------Functions---------------------------------

}
