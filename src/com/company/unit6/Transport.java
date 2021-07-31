package com.company.unit6;

public abstract class Transport {
    private int power;
    private int speed;
    private int weight;
    private String brand;

    public Transport(int power, int speed, int weight, String brand) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String description() {
        return "Марка " + brand + ", вес " + weight + ", максимальная скорость "
                + speed + ", мощность в лошадиных силах " + power + " мощность в киловаттах " + powerInKilowatt();
    }

    private double powerInKilowatt(){
        return power * 0.74;
    }
}
