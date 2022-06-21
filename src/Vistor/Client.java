package Vistor;

/*
@author HIT_Why 120L021418
@create 2022-06-09 22:58
*/
public class Client {

    public static void main(String[] args) {
        EmployeeList list=new EmployeeList();

        Employee f1=new FulltimeEmployee("正式1",3200.00,45);
        Employee p1=new ParttimeEmployee("临时1",80.00,20);
        Employee f2=new FulltimeEmployee("正式2",2000.00,40);
        Employee p2=new ParttimeEmployee("临时2",60.00,18);

        list.addEmployee(f1);
        list.addEmployee(p1);
        list.addEmployee(f2);
        list.addEmployee(p2);

        Department dep1=new FADepartment();
        Department dep2=new HRDepartment();

        System.out.println();
        list.accept(dep1);
        System.out.println();
        list.accept(dep2);


    }




}
