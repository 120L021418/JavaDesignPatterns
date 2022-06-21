package Template;

import java.sql.SQLOutput;

/*
@author HIT_Why 120L021418
@create 2022-06-09 19:57
*/
public class SavingAccount extends Account{

    @Override
    public boolean validate(String account, String password) {
        System.out.println("账号："+account);
        System.out.println("密码："+password);
        return true;
    }

    @Override
    public void calculate() {
        System.out.println("按定期利率计算利息！");
    }
}
