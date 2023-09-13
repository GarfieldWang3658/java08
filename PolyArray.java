package com.hspedu.poly_.polyarr_包;

import com.hspedu.extend.improve.Student;

public class PolyArray {
    public static void main(String[] args) {
        Person1[] persons = new Person1[5];
        persons[0] = new Person1("jack",20);
        persons[1] = new Student1("mick",16,123.2);
        persons[2] = new Student1("tanaka",15,334.3);
        persons[3] = new Teacher1("tawabe",40,250000);
        persons[4] = new Teacher1("ozawa",50,350000);

        for (int i = 0; i < persons.length; i++) {
            //person[i]的编译类型是Person1，运行类型是根据实际情况由JVM来判断
            System.out.println(persons[i].say());

            if (persons[i] instanceof Student1){
                ((Student1)persons[i]).study();
                //Student1.student = (Student)persons[i];
                //Student.study();
            }else if (persons[i] instanceof Teacher1){
                ((Teacher1)persons[i]).teach();
            }else{
                System.out.println("你输入的有错");
            }
        }
        }  
    }
class Person1{
    private String name;
    private int age;

    public String say(){
        return "名字为"+name+" 年龄"+age;
    }
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
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
class Student1 extends Person1{
    private double score;

    public Student1(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String say(){
        return super.say()+ " 考试分数"+score;
    }
    public void study() {
        System.out.println("学生" + getName() + "正在学习");
    }
}

class Teacher1 extends Person1{
    private double salary;

    public Teacher1(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String say(){
        return super.say()+ " 工资"+salary;    }
    public void teach(){
        System.out.println("老师"+getName()+"正在授课");
    }
}
