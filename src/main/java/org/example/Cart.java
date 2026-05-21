package org.example;

import java.util.ArrayList;

public class Cart {
    int cartId;
    int noOfItems;
    float cartMaxWeight;
    float currentWeight=0;
    ArrayList<Item> itemsInCart= new ArrayList<>();

    public float getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void getItemsInCart() {
        for (Item items:itemsInCart){
            IO.println("Name: "+items.Name+"price: "+items.price);
        }
    }

    public void setItemsInCart(ArrayList<Item> itemsInCart) {
        this.itemsInCart = itemsInCart;
    }
    public float getCartMaxWeight() {
        return cartMaxWeight;
    }
    public void setCartMaxWeight(float cartMaxWeight) {
        this.cartMaxWeight = cartMaxWeight;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }
    //=======================Main Functions===================================================


    public void addToCart(Item item){
        itemsInCart.add(item);
        currentWeight=currentWeight+item.weight;
    }
    public void removeFromCart(Item item){
        itemsInCart.remove(item);
        currentWeight=currentWeight-item.weight;
    }
    double cost=0;
    public double calculateTotal(){
        for (Item items:itemsInCart){
            cost+=items.price;
        }
        return cost;
    }
}

