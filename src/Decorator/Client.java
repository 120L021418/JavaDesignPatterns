package Decorator;

/*
@author HIT_Why 120L021418
*/

public class Client {
    public static void main(String[] args) {
        Component component=new Window();
        System.out.println("装饰前：");
        component.display();
        System.out.println();

        // 对列表框(具体构件类)进行装饰，首先添加滚动条，再添加边框
        Component cp=new BoarderDecorator(new BarDecorator(component));
        System.out.println("装饰后：");
        cp.display();
    }


}
