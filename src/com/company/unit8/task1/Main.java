package com.company.unit8.task1;

public class Main {
    public static void main(String[] args) {
        Human svetlana = new Human("Svetlana", new RainJacket(), new Sneakers(), new CargoTrousers());
        Human ivan = new Human("Ivan", new DownJacket(), new Boots(), new CargoTrousers());
        Human irina = new Human("Irina", new RainJacket(), new Sneakers(), new CulottesTrousers());

        svetlana.putOn();
        svetlana.takeOff();

        ivan.putOn();
        ivan.takeOff();

        irina.putOn();
        irina.takeOff();
    }
}
