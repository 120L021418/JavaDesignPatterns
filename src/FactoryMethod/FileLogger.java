package FactoryMethod;

/*
@author HIT_Why 120L021418
@create 2022-06-09 11:14
*/
public class FileLogger implements Logger{

    @Override
    public void writeLogger() {
        System.out.println("用文件写日志！");
    }
}
