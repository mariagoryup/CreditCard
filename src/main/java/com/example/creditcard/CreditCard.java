package com.example.creditcard;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Purchase> purchase;

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getPurchase() {
        return purchase;
    }

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchase = new ArrayList<>();
    }

    public boolean doIHaveMoney (Purchase purchase) {
        if (this.balance> purchase.getPrice()) {
            this.balance -= purchase.getPrice();
            this.purchase.add(purchase);
            return true;
        }
        return false;

    }
}
