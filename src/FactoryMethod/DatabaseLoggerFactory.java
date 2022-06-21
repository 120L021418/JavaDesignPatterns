package FactoryMethod;

/*
@author HIT_Why 120L021418
*/
public class DatabaseLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        System.out.println("连接数据库！");
        Logger logger=new DatabaseLogger();
        System.out.println("初始化数据库日志记录器！");
        return logger;
    }

}
