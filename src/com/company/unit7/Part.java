package com.company.unit7;

public abstract class Part {

    private int price;

    public Part(int price) {
        this.price = price;
    }

    public Part() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
