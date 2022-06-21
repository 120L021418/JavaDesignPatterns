package Decorator;

/*
@author HIT_Why 120L021418
*/
public class BoarderDecorator extends ComponentDecorator{

    public BoarderDecorator(Component component) {
        super(component);
    }

    public void display(){
        // 调用本类中的装饰功能1：增加滚动条
        this.setBoarder();
        // 调用父类中的display()方法，本质上某具体构件类中待装饰的方法  调用父类中的公共方法
        super.display();
    }

    public void setBoarder(){
        System.out.println("增加黑色边框！");
    }
}
