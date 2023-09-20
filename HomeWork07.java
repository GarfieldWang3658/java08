package com.hspedu.homework;

public class HomeWork07 {
}
class test {
    String name ="Rose";
    test(){
        System.out.println("test");
    }
    test(String name){
        this.name=name;
    }

}
class demo extends test{
    String name = "jack";
    demo(){
        super();
        System.out.println("demo");
    }
    demo(String s){
        super(s);
    }
    public void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        new demo().test();
        new demo("john").test();
    }
}