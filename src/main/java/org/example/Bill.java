package org.example;

import java.util.Date;

public class Bill {
    int id;
    Date billTime = new Date();
    double total=0.0;
    public double calculateTotal(Cart cart) {
        double total=cart.calculateTotal();
        return total;
    }
}
