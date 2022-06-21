package Iterator;

import java.util.List;

/*
@author HIT_Why 120L021418
*/
public class ProductIterator implements AbstractIterator{

    // 维护一个对抽象聚合类对象的引用 与普通工厂方法模式的区别
    private List<Object> products;
    private int c1;
    private int c2;

    public ProductIterator(ProductList products) {
        this.products = products.getObjects();
        this.c1 = 0;
        this.c2 = this.products.size()-1;
    }

    @Override
    public void next() {
        if(c1<products.size()){
            c1++;
        }
    }

    @Override
    public boolean isLast() {
        return (c1==products.size());
    }

    @Override
    public void previous() {
        if(c2>-1){
            c2--;
        }

    }

    @Override
    public boolean isFirst() {
        return (c2==-1);
    }

    @Override
    public Object getNextItem() {
        return products.get(c1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(c2);
    }

}
