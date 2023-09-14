package com.hspedu.object_;

import org.w3c.dom.ls.LSOutput;

public class EqualsExercise02 {
    public static void main(String[] args) {


        person p1 = new person();
        p1.name = "hspedu";

        person p2 = new person();
        p2.name = "hspedu";

        System.out.println(p1==p2);//F，对象已经不同
        System.out.println(p1.name.equals(p2.name));//T，判断固定的属性
        System.out.println(p1.equals(p2));//F，没有被重写，由于对象不同，所以false

        String s1 = new String("asdf");
        String s2 = new String("asdf");
        System.out.println(s1.equals(s2));//T，程序已经被重写，所以true
        System.out.println(s1==s2);//F，对象不同




    }
}
class person{
    public String name;
}
