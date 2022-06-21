package Vistor;

/*
@author HIT_Why 120L021418
@create 2022-06-09 22:39
*/
public interface Department {
    // 定义针对不同具体元素对象的访问接口
    public void visit(FulltimeEmployee employee);
    public void visit(ParttimeEmployee employee);
}
