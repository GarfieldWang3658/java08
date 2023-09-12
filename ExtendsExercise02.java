package com.hspedu.extend.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        C c = new C();
        //输出
        //A类
        //hahah B类
        //c有参
        //c无参

    }
}
class A{
    public A(){
        System.out.println("我是A类");
    }
}
class B extends A{
    public B() {
        System.out.println("我是B类无参构造器");
    }
    public B(String name){
        //在执行这个构造器之前有个默认的super，由于B继承了A
        System.out.println(name+"我是B类的有参构造器");
    }
}
class C extends B{
    public C(){
        this("hello");
        System.out.println("我是C类无参构造器");
    }
    public C(String name){
        super("hahaha");
        System.out.println("我是C类有参构造器");
    }
}