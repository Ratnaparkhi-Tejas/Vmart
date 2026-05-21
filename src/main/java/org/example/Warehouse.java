package org.example;

import java.util.ArrayList;

public class Warehouse {
    ArrayList<Item> itemsInWarehouse= new ArrayList<Item>();

    public void addItemInWarehouse(Item item,int quantity){
        for (Item existingItem: itemsInWarehouse){
           if (existingItem.itemId== item.itemId) {
               existingItem.stockInWarehouse+=quantity;
               return;
           }
        }
        item.stockInWarehouse=quantity;
        itemsInWarehouse.add(item);
    }
    public void checkStock(){
        for (Item items: itemsInWarehouse){
            System.out.println("Name: "+items.Name+"PID"+items.itemId+"Stock:" + items.getStockInWarehouse());
        }
    }
//=====================================Getters and setters===============
    public void setItemsInWarehouse(ArrayList<Item> itemsInWarehouse) {
        this.itemsInWarehouse = itemsInWarehouse;
    }
    public ArrayList<Item> getItemsInWarehouse() {
        return itemsInWarehouse;
    }
    //========================================================

}
