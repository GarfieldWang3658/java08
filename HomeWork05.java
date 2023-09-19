package com.hspedu.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {
        worker tom = new worker(20000, "tom");

        Peasant tanaka = new Peasant(25000, "tanaka");
        Teacher1 watabe = new Teacher1(30000, "WATABE");
        watabe.setDay(30);
        watabe.setPay(500);
        Scientist wang = new Scientist(50000, "wang");
        wang.setBonus(30000);
        Waiter li = new Waiter(15000, "li");
        tom.Salary();
        tanaka.Salary();
        watabe.Salary();
        wang.Salary();
        li.Salary();


    }
}
class empolyee2{
    private double salary;
    private String name;
    private int salaryMonths=12;
    public empolyee2(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName2() {
        return name;
    }
    public void setName2(String name) {
        this.name = name;
    }
    public int getSalaryMonths() {
        return salaryMonths;
    }
    public void setSalaryMonths(int salaryMonths) {
        this.salaryMonths = salaryMonths;
    }
    public void Salary(){
        System.out.println(getName2()+"的工资为"+(getSalary()*getSalaryMonths()));
    }
}
class worker extends empolyee2{
    public worker(double salary, String name) {
        super(salary, name);
    }
    public void Salary(){
        super.Salary();
    }
}
class Peasant extends empolyee2{
    public Peasant(double salary, String name) {
        super(salary, name);
    }
    public void Salary(){
        super.Salary();
    }
}
class Teacher1 extends empolyee2{
    private double pay;
    private int day;
    public Teacher1(double salary, String name) {
        super(salary, name);
    }
    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void Salary(){
        System.out.println(getName2()+"的工资为"+(getSalary()*getSalaryMonths()+getPay()*getDay()));
    }

}
class Scientist extends empolyee2{
    public Scientist(double salary, String name) {
        super(salary, name);
    }
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void Salary(){
        System.out.println(getName2()+"的工资为"+(getSalary()*getSalaryMonths()+getBonus()));
    }

}
class Waiter extends empolyee2{
    public Waiter(double salary, String name) {
        super(salary, name);
    }
    public void Salary(){
        super.Salary();
    }
}
