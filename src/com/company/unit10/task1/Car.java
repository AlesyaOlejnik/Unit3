package com.company.unit10.task1;

import java.util.Random;

public class Car {

    private String brand;
    private double price;
    private double speed;

    public Car(String brand, double price, double speed) {
        this.brand = brand;
        this.price = price;
        this.speed = speed;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void start() throws StartException {
        Random random = new Random();
        int randomValue = random.nextInt(20);
        if (randomValue % 2 == 0) {
            throw new StartException("Автомобиль марки " + brand + " не завёлся");
        }
        System.out.println("Автомобиль марки  " + brand + " завёлся");
    }
}
