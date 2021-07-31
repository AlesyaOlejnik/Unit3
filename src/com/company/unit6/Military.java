package com.company.unit6;

public class Military extends Air {
    private boolean systemOfEjection;
    private int numberOfMissiles;

    public Military(int power, int speed, int weight, String brand, int wingspan, int minStripLength, boolean
            systemOfEjection, int numberOfMissiles) {
        super(power, speed, weight, brand, wingspan, minStripLength);
        this.systemOfEjection = systemOfEjection;
        this.numberOfMissiles = numberOfMissiles;
    }

    @Override
    public String description() {
        String description = super.description();
        return description + " система катапультирования " + systemOfEjection +
                " количество ракет на борту " + numberOfMissiles;
    }

    public boolean getSystemOfEjection() {
        return systemOfEjection;
    }

    public void setSystemOfEjection(boolean systemOfEjection) {
        this.systemOfEjection = systemOfEjection;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public void fire() {
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутсвуют");
        }
    }

    public void catapult() {
        if (systemOfEjection) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
