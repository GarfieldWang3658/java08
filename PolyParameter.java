package com.hspedu.poly_.polyparameter_包;

public class PolyParameter {
    public static void main(String[] args) {
        work tom = new work("TOM",2500);
        manage milan = new manage("milan",5000,20000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);

        PolyParameter polyparameter = new PolyParameter();

        polyparameter.testwork(tom);
        polyparameter.testwork(milan);

    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());//动态绑定机制
    }
    public void testwork(Employee e){
        if (e instanceof work){
            ((work) e).work();//向下转型的操作
        }else if (e instanceof manage){
            ((manage) e).manage();
        }else{
            System.out.println("不做处理");
        }
    }
}
