package Vistor;

/*
@author HIT_Why 120L021418
@create 2022-06-09 22:39
*/
public class FADepartment implements Department{

    // 针对不同具体元素 重载  使用不同的visit()  实现同一个访问者访问不同的元素

    @Override
    public void visit(FulltimeEmployee employee) {
        System.out.println("财务部：计算某个正式员工实际工资！");

    }

    @Override
    public void visit(ParttimeEmployee employee) {
        System.out.println("财务部：计算某个临时员工实际工资！");

    }
}
