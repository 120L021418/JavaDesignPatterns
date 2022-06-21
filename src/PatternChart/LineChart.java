package PatternChart;

/*
@author HIT_Why 120L021418
@create 2022-06-09 10:48
*/
public class LineChart implements Chart{

    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }

}
