package Iterator;

import java.util.ArrayList;
import java.util.List;

/*
@author HIT_Why 120L021418
@create 2022-06-09 20:37
*/
public abstract class AbstractObjectList {

    // 维护一个已经实现的聚合类List的对象
    protected List<Object> objects=new ArrayList<>();

    // 委托
    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    // 这里也是将自定义聚合类的功能实现委托给了已经实现的聚合类List
    public void addObject(Object obj){
        this.objects.add(obj);
    }

    // 这里也是将自定义聚合类的功能实现委托给了已经实现的聚合类List
    public void removeObject(Object obj){
        this.objects.remove(obj);
    }

    // 这里也是将自定义聚合类的功能实现委托给了已经实现的聚合类List
    public List<Object> getObjects(){
        return this.objects;
    }

    // 声明创建迭代器产品的工厂方法
    public abstract AbstractIterator createIterator();
}
