package com.hspedu.debug_包;

public class DebugExercise {
    public static void main(String[] args) {
        Person1 jack = new Person1("jack",20);
        System.out.println(jack);

    }
}
class Person1{
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
