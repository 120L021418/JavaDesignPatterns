package FactoryMethod;

/*
@author HIT_Why 120L021418
@create 2022-06-09 11:13
*/
public class DatabaseLogger implements Logger{

    @Override
    public void writeLogger() {
        System.out.println("用数据库写日志！");
    }
}
