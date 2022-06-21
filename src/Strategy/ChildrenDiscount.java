package Strategy;

import javax.sound.midi.Soundbank;

/*
@author HIT_Why 120L021418
@create 2022-06-09 19:08
*/
public class ChildrenDiscount implements Discount{

    @Override
    public double calculate(double price) {
        System.out.println("儿童票：");
        if(price>=20){
            return price-10;
        }
        return price;
    }
}
