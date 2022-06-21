package Template;

/*
@author HIT_Why 120L021418
*/
public class Client {
    public static void main(String[] args) {
        // 编译时父类寻找确定，运行时子类覆盖执行
        Account ac=new CurrentAccount();
        ac.handle("哈工大","1920-2022");
        System.out.println();

        ac.handle("HIT","2022");
        System.out.println();

        Account alwaysRight=new SavingAccount();
        alwaysRight.handle("HIT","2022");
    }
}
