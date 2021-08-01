package com.company.unit7.legs;

import com.company.unit7.Part;

public class SonyLeg extends Part implements ILeg {

    public SonyLeg(int price) {
        super(price);
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Ноги Sony шагают");
    }
}
