package com.company.unit7.legs;

import com.company.unit7.Part;

public class SamsungLeg extends Part implements ILeg {

    public SamsungLeg(int price) {
        super(price);
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Ноги Toshiba шагают");
    }
}
