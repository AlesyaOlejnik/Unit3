package com.company.unit10.task1;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW" ,75660 ,350);
        Car car2 = new Car("Audi" ,45660 ,250);

    try {
        car1.start();
        car2.start();
    }
    catch (StartException ex){
        System.out.println(ex.getMessage());
    }
    }
}
