package com.hspedu.extend;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存布局
        System.out.println(son.name);//返回大头儿子
        System.out.println(son.getAge());//返回的是father的age，39
        System.out.println(son.hobby);//返回旅游
        //注意：要按照查找关系。 来返回数据
        //规则：
        //1、首先看子类的是否有该属性，
        //2、如果子类有这个属性，并且可以访问，则返回信息
        //3、如果子类没有这个属性，就看父类有没有这个属性，
        // 如果父类有这个属性，并且可以访问，则返回信息
        //4、如果父类没有就按照3的规则，继续找上级父类，直到Object

    }
}
class GrandPa{//爷爷类
    String name = "大头爷爷";
    String hobby = "旅游";
}
class Father extends GrandPa{//父类
    String name = "大头爸爸";
    private int age = 39;

    public int getAge(){
        return age;
    }
}
class Son extends Father{//子类
    String name = "大头儿子";
}


