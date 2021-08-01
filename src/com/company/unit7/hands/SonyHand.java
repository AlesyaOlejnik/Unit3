package com.company.unit7.hands;

import com.company.unit7.Part;

public class SonyHand extends Part implements IHand {

    public SonyHand(int price) {
        super(price);
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Sony");
    }


}
