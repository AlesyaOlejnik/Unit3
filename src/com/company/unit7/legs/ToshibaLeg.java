package com.company.unit7.legs;

import com.company.unit7.Part;

public class ToshibaLeg  extends Part implements ILeg {

    public ToshibaLeg(int price) {
        super(price);
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Ноги Toshiba шагают");
    }
}
