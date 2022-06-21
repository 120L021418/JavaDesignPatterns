package Adaptor;

/*
@author HIT_Why 120L021418
@create 2022-06-09 12:00
*/
public interface CarInter {
    public default void move(){
        System.out.println("汽车移动！");
    }
    public void soundInter();
    public void blingInter();
}
