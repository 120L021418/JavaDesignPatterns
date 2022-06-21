package Vistor;

/*
@author HIT_Why 120L021418
@create 2022-06-09 22:40
*/
public class FulltimeEmployee implements Employee{

    private String name;
    private double weeklyWage;
    private int workTime;

    public FulltimeEmployee(String name, double weeklyWage, int workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeeklyWage(double weeklyWage) {
        this.weeklyWage = weeklyWage;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public double getWeeklyWage() {
        return weeklyWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    // 访问者模式的精髓所在：运行时确定访问者，实现对同一元素的不同访问方式 (双向委托)
    @Override
    public void accept(Department handler) {
        handler.visit(this);
    }
}
