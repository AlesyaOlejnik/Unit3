package com.company.unit6;

public class Passenger extends Terrestrial {

    BodeType bodeType;
    int numbersOfPassengers;

    public Passenger(int power, int speed, int weight, String brand, int numberOfWheels, int fuelConsumption, BodeType bodeType, int numbersOfPassengers) {
        super(power, speed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodeType = bodeType;
        this.numbersOfPassengers = numbersOfPassengers;
    }

    @Override
    public String description() {
        String description = super.description();
        return description + " тип кузова " + bodeType.name + " число пассажиров "
                + numbersOfPassengers;
    }

    public BodeType getBodeType() {
        return bodeType;
    }

    public void setBodeType(BodeType bodeType) {
        this.bodeType = bodeType;
    }

    public void infoOfRunByTime(double hours) {
        int speed = getSpeed();
        double distance = speed * hours;
        double fuel = getFuelByTime(hours);
        System.out.println("За время " + hours + "ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " +
                speed + " км/ч проедет " + distance + " км и израсходует " + fuel + " литров топлива");
    }

    private double getFuelByTime(double hours) {
        return getFuelConsumption() * hours;
    }
}
