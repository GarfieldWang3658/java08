package com.hspedu.super_;

public class B extends A {
    //访问父类的属性，但不能访问父类的private属性，super.属性名，
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }
    //访问父类的方法，但不能访问父类的private方法，super.方法名(参数列表)
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }
    //访问父类的构造器，super(参数列表)；只能放在构造器的第一句，只能出现一句。
    //public  B(){
        //super();
    public void sum(){
        System.out.println("B类的sum（）");
        //调用A类的cal方法
        //因为子类B 没有cal方法
        //因此可以使用一下3种方式
        //cal();
        //找cal方法的顺序是先找本类，如果有，且可以调用，则调用，
        // 如果没有，则找父类，如果有，且可以调用，则调用，
        // 如果父类没有，则继续找父类的父类，依次直到Object
        //如果在查找方法的过程中，找到了，但不能访问，则报错
        //如果没有找到，则提示方法不存在。
        //this.cal();//等价cal
        super.cal();//直接查找父类，其他逻辑/规则一样


    }
    public void cal(){
        System.out.println("B类的cal方法");
    }

}
