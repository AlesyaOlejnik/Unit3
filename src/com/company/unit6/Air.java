package com.company.unit6;

public abstract class Air extends Transport {
   private int wingspan;
   private int minStripLength;

    public Air(int power, int speed, int weight, String brand, int wingspan, int minStripLength) {
        super(power, speed, weight, brand);
        this.wingspan = wingspan;
        this.minStripLength = minStripLength;
    }

    @Override
    public String description() {
    String description = super.description();
    return description + " размах крыльев " + wingspan + " минимальная длина для взлётно-посадочной полосы " + minStripLength;

    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan){
        this.wingspan=wingspan;
    }
    public int getMinStripLength(){
        return minStripLength;
    }
    public  void setMinStripLength(int minStripLength){
        this.minStripLength=minStripLength;
    }
}

