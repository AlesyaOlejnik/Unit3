package com.company.unit7;

import com.company.unit7.hands.SamsungHand;
import com.company.unit7.hands.SonyHand;
import com.company.unit7.heads.SamsungHead;
import com.company.unit7.heads.SonyHead;
import com.company.unit7.heads.ToshibaHead;
import com.company.unit7.legs.SamsungLeg;
import com.company.unit7.legs.SonyLeg;
import com.company.unit7.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot robot1 = new Robot(new SamsungHead(25), new SonyHand(20), new ToshibaLeg(15));
        Robot robot2 = new Robot(new ToshibaHead(30), new SamsungHand(15), new SamsungLeg(12));
        Robot robot3 = new Robot(new SonyHead(45), new SamsungHand(20), new ToshibaLeg(30));
        robot1.action();
        robot2.action();
        robot3.action();
        theMostExpensive(robot1 ,robot2,robot3);
    }

    public static void theMostExpensive(Robot robot1 , Robot robot2,Robot robot3 ){
        int robot1Price = robot1.getPrice();
        int robot2Price = robot2.getPrice();
        int robot3Price = robot3.getPrice();

        if(robot1Price>robot2Price && robot1Price>robot3Price){
            System.out.println("Робот 1 дороже всех");
        }else if (robot2Price>robot1Price && robot2Price>robot3Price){
            System.out.println("Робот 2 дороже всех");
        }else if (robot3Price>robot1Price && robot3Price>robot2Price){
            System.out.println("Робот 3 дороже всех");
        }else  {
            System.out.println("Либо у всех цена одинаковая ,либо у двух из них одновременно одинаковая стоимость");
        }
    }
}
