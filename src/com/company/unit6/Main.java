package com.company.unit6;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(300, 400, 2000,
                "Rover", 4, 9, BodeType.SEDAN, 5);
        System.out.println(passenger.description());
        passenger.infoOfRunByTime(4);

        Cargo cargo = new Cargo(250 , 200,5000, "MAZ" ,10 ,25 ,
                5000 );
        System.out.println(cargo.description());
        cargo.checkCapacity(6000);

        Civil civil = new Civil(1000, 1000, 100000, "Aerobus", 5, 2000, 200,
                true);
        System.out.println(civil.description());
        civil.checkCapacity(150);

        Military military = new Military(2500,1100,25000,"Mig",5,1500,true,8);
        System.out.println(military.description());
        military.fire();
        military.catapult();
    }
}
