package com.hspedu.homework;

public class HomeWork03 {
    public static void main(String[] args) {
        Professor professor = new Professor("TOM", 50, "高级", 50000, 1.3);
        AssociatProfessor associatProfessor = new AssociatProfessor("TANAKA", 45, "中级", 35000, 1.2);
        Lecturer lecturer = new Lecturer("Simth", 38, "初级", 20000, 1.1);

        professor.introduce();
        associatProfessor.introduce();
        lecturer.introduce();


    }
}

class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;
    private double level;

    public Teacher(String name, int age, String post, double salary, double level) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.level = level;
    }

    public String getNAME() {
        return name;
    }

    public void setNAME(String name) {
        this.name = name;
    }

    public int getAGE() {
        return age;
    }

    public void setAGE(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public void introduce(){
        System.out.println("NAME=\t"+getNAME()+"AGE=\t"+getAGE()+"POST=\t"+getPost()+"SALARY=\t"+getSalary());
    }
}
class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }
    public void introduce(){
        System.out.println("Professor的信息");
        super.introduce();
    }
}
class AssociatProfessor extends Teacher{
    public AssociatProfessor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }
    public void introduce(){
        System.out.println("AssociatProfessor的信息");
        super.introduce();
    }
}
class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }
    public void introduce(){
        System.out.println("Lecturer的信息");
        super.introduce();
    }
}