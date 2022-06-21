package Iterator;

import java.util.ArrayList;
import java.util.List;

/*
@author HIT_Why 120L021418
*/
public class Client {
    public static void main(String[] args) {
        // 注意：Object不可修改为String ： 泛型类不满足Liskov替换原则
        List<Object> products=new ArrayList<>();
        products.add("-1-");
        products.add("-2-");
        products.add("-3-");
        products.add("-4-");
        products.add("-5-");
        ProductList list=new ProductList(products);

        // 不可声明为ProductIterator：静态检测时，list.createIterator()返回值AbstractIterator
        // 用范围更大的类去接收范围更小的类
        AbstractIterator iterator=list.createIterator();

        System.out.println("正向遍历");
        while(!iterator.isLast()){
            System.out.print(iterator.getNextItem()+" ");
            iterator.next();
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("反向遍历");
        while(!iterator.isFirst()){
            System.out.print(iterator.getPreviousItem()+" ");
            iterator.previous();
        }


    }


}
