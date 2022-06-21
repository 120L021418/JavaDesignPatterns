package Strategy;

/*
@author HIT_Why 120L021418
@create 2022-06-09 19:06
*/
public class StudentDiscount implements Discount{


    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return price*0.8;
    }
}
