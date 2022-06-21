package Adaptor;

/*
@author HIT_Why 120L021418
@create 2022-06-09 11:47
*/
public abstract class CarController {
    public void move(){
        System.out.println("汽车移动！");
    }
    public abstract void sound();
    public abstract void bling();
}
