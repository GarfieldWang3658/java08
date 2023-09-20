package com.hspedu.homework;

public class HomeWrok15 {
    public static void main(String[] args) {
        AAA obj = new BBB();
        AAA b1 = obj;
        System.out.println(obj.getClass());
        obj = new CCC();
        System.out.println(obj.getClass());
        obj = b1;
        System.out.println(obj.getClass());
    }
}
class AAA{

}
class BBB extends AAA{

}
class CCC extends BBB{

}
