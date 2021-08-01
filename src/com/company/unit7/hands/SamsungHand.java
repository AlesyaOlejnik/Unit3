package com.company.unit7.hands;

import com.company.unit7.Part;

public class SamsungHand extends Part implements IHand {

    public SamsungHand(int price) {
        super(price);
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Samsung");
    }
}
