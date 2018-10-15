package com.epiclancers.myapplication;

public class Child {

    String name;
    String supplier;
    String cp;
    String qty;
    String amount;

    public Child(String name, String supplier, String cp, String qty, String amount) {
        this.name = name;
        this.supplier = supplier;
        this.cp = cp;
        this.qty = qty;
        this.amount = amount;
    }
    public Child() {
    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getCp() {
        return cp;
    }

    public String getQty() {
        return qty;
    }

    public String getAmount() {
        return amount;
    }
}