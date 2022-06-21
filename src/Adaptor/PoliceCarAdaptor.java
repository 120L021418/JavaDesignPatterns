package Adaptor;

/*
@author HIT_Why 120L021418
*/
public class PoliceCarAdaptor implements CarInter {
    // 维持两个对适配者对象的引用
    private PoliceSound psound;
    private PoliceLamp plamp;

    // 要么set  要么constructor
    public PoliceCarAdaptor() {
        this.psound = new PoliceSound();
        this.plamp = new PoliceLamp();
    }


    @Override
    public void soundInter() {
        System.out.print("装饰sound功能！----");
        psound.alarmSound();
    }

    @Override
    public void blingInter() {
        System.out.print("装饰bling功能！----");
        plamp.alarmLamp();
    }
}
