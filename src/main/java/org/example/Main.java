package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Item item1 = new Item();
        item1.Name = "Milk Packet";
        item1.Company = "Amul";
        item1.itemId = 101;
        item1.type = "Dairy";
        item1.refrigerationRequired = true;
        item1.stockOnBin = 20;
        item1.stockInWarehouse = 100;
        item1.weight = 1.0f;
        item1.dimensions = "20x10x5 cm";
        item1.price=105.00f;

        Item item2 = new Item();
        item2.Name = "Shampoo";
        item2.Company = "Dove";
        item2.itemId = 102;
        item2.type = "Personal Care";
        item2.refrigerationRequired = false;
        item2.stockOnBin = 15;
        item2.stockInWarehouse = 80;
        item2.weight = 0.5f;
        item2.dimensions = "15x5x5 cm";
        item2.price=100.00f;


        Item item3 = new Item();
        item3.Name = "Ice Cream";
        item3.Company = "Kwality Walls";
        item3.itemId = 103;
        item3.type = "Frozen Food";
        item3.refrigerationRequired = true;
        item3.stockOnBin = 10;
        item3.stockInWarehouse = 50;
        item3.weight = 0.75f;
        item3.dimensions = "12x8x8 cm";
        item3.price= 300.00f;

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


        Cart cart1 = new Cart();
        cart1.cartId = 201;
        cart1.noOfItems = 3;
        cart1.cartMaxWeight = 25.0f;
        cart1.currentWeight = 8.5f;

// assuming item1, item2, item3 already exist
        cart1.itemsInCart.add(item1);
        cart1.itemsInCart.add(item2);
        cart1.itemsInCart.add(item3);

        cart1.getItemsInCart();
        Bill bill = new Bill();
        IO.println(bill.calculateTotal(cart1));

    }
}
