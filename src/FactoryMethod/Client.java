package FactoryMethod;

/*
@author HIT_Why 120L021418
*/
public class Client {
    public static void main(String[] args) {

        // 通过工厂创建产品，并非直接new一个所需的产品
        Logger logger=new DatabaseLoggerFactory().createLogger();
        // 使用产品
        logger.writeLogger();
        /*
        如果需要增加一个新的产品，只需要创建一个新的具体产品类以及相对应的具体工厂，并分别实现write和create即可
         */
    }
}
