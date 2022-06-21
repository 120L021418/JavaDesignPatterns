package Adaptor;

/*
@author HIT_Why 120L021418
*/
public class Client {
    public static void main(String[] args) {
        CarInter car=new PoliceCarAdaptor();
        car.move();
        car.blingInter();
        car.soundInter();
    }

}

