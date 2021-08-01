package com.company.unit7.heads;

import com.company.unit7.Part;

public class SamsungHead extends Part implements IHead {

    public SamsungHead(int price) {
        super(price);
    }

    public SamsungHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");
    }
}
