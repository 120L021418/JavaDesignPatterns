package Template;

/*
@author HIT_Why 120L021418
@create 2022-06-09 19:56
*/
public class CurrentAccount extends Account{

    @Override
    public void calculate() {
        System.out.println("按活期利率计算利息！");
    }
}
