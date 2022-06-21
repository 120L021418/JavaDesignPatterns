package Vistor;

/*
@author HIT_Why 120L021418
@create 2022-06-09 22:42
*/

import java.util.ArrayList;
import java.util.List;

// 重要！！！！！！！！！！！11
public class EmployeeList {
    private ArrayList<Employee> list =new ArrayList<>();

    // 这里其实也使用了委托
    public void addEmployee(Employee employee){
        list.add(employee);
    }

    public void accept(Department handler){
        for (Employee obj:list){
            obj.accept(handler);
        }
    }

}
