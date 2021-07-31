package com.company.unit6;

public class Cargo extends Terrestrial {
    private int liftingCapacity;

    public Cargo(int power, int speed, int weight, String brand, int numberOfWheels, int fuelConsumption, int liftingCapacity) {
        super(power, speed, weight, brand, numberOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String description() {
        String description = super.description();
        return description + " грузоподъемность " + liftingCapacity;

    }

    public int setLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public void checkCapacity(int weight) {
        if (weight <= liftingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
