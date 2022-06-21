package PatternChart;

/*
@author HIT_Why 120L021418
*/
public class ChartFactory {

    public static Chart getChart(String str){
        Chart chart=null;
        if(str.equalsIgnoreCase("line")){
            chart=new LineChart();
            System.out.println("初始化设置折线图!");
        }
        else if(str.equalsIgnoreCase("pie")){
            chart=new PieChart();
            System.out.println("初始化设置饼状图!");
        }
        return chart;
    }

}
