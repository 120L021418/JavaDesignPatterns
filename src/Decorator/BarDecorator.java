package Decorator;

/*
@author HIT_Why 120L021418
@create 2022-06-09 16:25
*/
public class BarDecorator extends ComponentDecorator{

    public BarDecorator(Component component) {
        super(component);
    }

    public void display(){
        // 调用本类中的装饰功能1：增加滚动条
        this.setBar();
        // 调用父类中的display()方法，本质上某具体构件类中待装饰的方法
        super.display();
    }

    public void setBar(){
        System.out.println("增加滚动条！");
    }

}
