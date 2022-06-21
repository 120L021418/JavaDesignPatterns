package Iterator;

import java.util.List;

/*
@author HIT_Why 120L021418
@create 2022-06-09 20:50
*/
public class ProductList extends AbstractObjectList{

    public ProductList(List<Object> objects) {
        super(objects);
    }

    // 关键一步：创建具体工厂对应的具体产品，同时给具体产品传参，具体产品中使用具体工厂对象的方法遍历该具体对象，实现一一对应
    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
