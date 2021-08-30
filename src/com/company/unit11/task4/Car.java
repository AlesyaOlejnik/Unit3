package com.company.unit11.task4;

import java.io.*;

public class Car implements Serializable {
    private String brand;
    private double speed;
    private double price;

    public Car(String brand, double speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) throws Exception {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\com\\company\\unit11\\task4\\car.dat"))) {
            Car car = new Car("Audi",400,100000);
            objectOutputStream.writeObject(car);
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src\\com\\company\\unit11\\task4\\car.dat"))){
            Car car =(Car)objectInputStream.readObject();
            System.out.println(car.getPrice() + " " + car.getSpeed() + " " + car.getBrand());
        }
    }
    }
