package Vistor;

/*
@author HIT_Why 120L021418
@create 2022-06-09 22:39
*/
public class HRDepartment implements Department{
    @Override
    public void visit(FulltimeEmployee employee) {
        System.out.println("人力资源部：计算某正式员工实际工作时间、加班时间！请假时间！");
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        System.out.println("人力资源部：计算某临时员工实际工作时间、加班时间！请假时间！");
    }
}
