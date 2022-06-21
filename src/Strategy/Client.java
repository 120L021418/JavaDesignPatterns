package Strategy;

/*
@author HIT_Why 120L021418
*/
public class Client {
    public static void main(String[] args) {

        MovieTicket ticket=new MovieTicket();
        double srcPrice=60.0;
        ticket.setPrice(srcPrice);
        System.out.println("原始票价："+srcPrice);
        System.out.println();

        double nowPrice;

        ticket.setDiscount(new StudentDiscount());
        nowPrice=ticket.getPrice();
        System.out.println("折后价格："+nowPrice);
        System.out.println();

        ticket.setDiscount(new ChildrenDiscount());
        nowPrice=ticket.getPrice();
        System.out.println("折后价格："+nowPrice);
        System.out.println();

        ticket.setDiscount(new VIPDiscount());
        nowPrice=ticket.getPrice();
        System.out.println("折后价格："+nowPrice);
        System.out.println();

    }

}
