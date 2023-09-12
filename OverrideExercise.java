package com.hspedu.override;


import java.time.Period;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person=new Person("wangyang",20);
        System.out.println(person.say());

        Student student = new Student("big duo",10,"112233",88.4);

        System.out.println(student.say());


    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say(){
    return "自我介绍，我的名字叫"+this.name+"，今年"+this.age+"岁";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person {
    private String id;
    private double score;

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
        return super.say()+"ID为："+this.id+"得分为："+this.score;

    }
}
