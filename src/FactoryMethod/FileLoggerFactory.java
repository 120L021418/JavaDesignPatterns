package FactoryMethod;

/*
@author HIT_Why 120L021418
@create 2022-06-09 11:18
*/
public class FileLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        Logger logger=new FileLogger();
        System.out.println("创建日志记录文件！");
        return logger;
    }

}
