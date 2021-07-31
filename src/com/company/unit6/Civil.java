package com.company.unit6;

public class Civil extends Air {
    private int numberOfPassengers;
    private boolean businessClass;

    public Civil(int power, int speed, int weight, String brand, int wingspan
            , int minStripLength, int numberOfPassengers, boolean businessClass) {
        super(power, speed, weight, brand, wingspan, minStripLength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public String description() {
        String description = super.description();
        return description + " количество пассажиров " + numberOfPassengers
                + " бизнес класс " + businessClass;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass() {
        this.businessClass = businessClass;
    }

    public void checkCapacity(int passengers) {
        if (passengers <= numberOfPassengers) {
            System.out.println("Самолёт заполнен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}

