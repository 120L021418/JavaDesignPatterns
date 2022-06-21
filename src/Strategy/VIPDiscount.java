package Strategy;

/*
@author HIT_Why 120L021418
@create 2022-06-09 19:10
*/
public class VIPDiscount implements Discount{


    @Override
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price*0.5;
    }
}
