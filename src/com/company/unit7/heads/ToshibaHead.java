package com.company.unit7.heads;

import com.company.unit7.Part;

public class ToshibaHead extends Part implements IHead {
    public ToshibaHead(int price) {
        super(price);
    }

    public ToshibaHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }
}
