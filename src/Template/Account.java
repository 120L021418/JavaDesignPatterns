package Template;

/*
@author HIT_Why 120L021418
*/
public abstract class Account {

    public boolean validate(String account,String password){
        System.out.println("账号："+account);
        System.out.println("密码："+password);
        return account.equalsIgnoreCase("哈工大") && password.equalsIgnoreCase("1920-2022");
    }

    public abstract void calculate();

    public void display(){
        System.out.println("显示利息！");
    }

    public final void handle(String account,String password){
        if(!this.validate(account,password)){
            System.out.println("账号或密码错误！");
            return;
        }
        calculate();
        display();
    }
}
