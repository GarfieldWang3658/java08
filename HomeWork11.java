package com.hspedu.homework;

public class HomeWork11 {
    public static void main(String[] args) {
        Person5 p = new Student();
        p.run();//student run
        p.eat();//person eat
        //向下转型
        Student s = ( Student)p;
        s.run();//student run
        s.study();//student study
        s.eat();//person eat
    }
}
class Person5{
    public Person5() {
    }

    public void run(){
        System.out.println("跑");
    }
    public void eat(){
        System.out.println("吃");
    }
}
class Student extends Person5{
    public void run(){
        System.out.println("Student run");
    }
    public void study(){
        System.out.println("student study...");
    }

}


