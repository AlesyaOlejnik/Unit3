package com.company.unit7.hands;

import com.company.unit7.Part;

public class ToshibaHand extends Part implements IHand {

    public ToshibaHand(int price) {
        super(price);
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Toshiba");
    }
}
