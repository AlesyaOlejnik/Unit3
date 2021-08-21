package com.company.unit8.task1;

public class Human {

    String name;
    Jacket jacket;
    Shoes shoes;
    Trousers trousers;

    public Human(String name, Jacket jacket, Shoes shoes, Trousers trousers) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }

    public void putOn() {
        System.out.println(name );
        shoes.putOn();
        jacket.putOn();
        trousers.putOn();

    }

    public void takeOff() {
        System.out.println(name);
        shoes.takeOff();
        jacket.takeOff();
        trousers.takeOff();
    }
}
