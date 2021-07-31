package com.company.unit6;

public abstract class Terrestrial extends Transport {
   private int numberOfWheels;
   private int fuelConsumption;

    public Terrestrial(int power, int speed, int weight, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, speed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String description() {
        String description = super.description();
        return description + " количество колёс " + numberOfWheels
                + " расход топлива " + fuelConsumption;
    }
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels=numberOfWheels;
    }
    public int getFuelConsumption(){
        return fuelConsumption;
    }
    public void setFuelConsumption(int fuelConsumption){
        this.fuelConsumption=fuelConsumption;
    }

}
