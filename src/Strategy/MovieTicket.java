package Strategy;

/*
@author HIT_Why 120L021418
*/
public class MovieTicket {
    private double price;
    // 维持一个对抽象算法类对象的引用，由客户端通过set方法动态决定使用何种算法 (-------------------------关键-------------------------)
    private Discount discount;

    // 由客户端通过set方法动态决定使用何种算法
    public void setPrice(double price){
        this.price=price;
    }

    public void setDiscount(Discount discount){
        this.discount=discount;
    }

    // 将计算票价的具体算法实现委托给具体算法类对象
    public double getPrice(){
        // 调用具体算法
        return this.discount.calculate(this.price);
    }

}
