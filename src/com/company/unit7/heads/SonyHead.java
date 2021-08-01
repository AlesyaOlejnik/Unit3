package com.company.unit7.heads;

import com.company.unit7.Part;

public class SonyHead extends Part implements IHead {

    public SonyHead(int price) {
        super(price);
    }

    public SonyHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony");
    }

}
