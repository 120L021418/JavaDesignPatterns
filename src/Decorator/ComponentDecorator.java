package Decorator;

/*
@author HIT_Why 120L021418
@create 2022-06-09 16:23
*/
public class ComponentDecorator implements Component{
    // 设置为private：防止被子类修改
    // 维护一个对抽象构件类对象的引用
    private Component component;

    // 注入抽象构件类型的对象：委托
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        // 子类的公共方法  交给父类去实现
        component.display();
    }
}
