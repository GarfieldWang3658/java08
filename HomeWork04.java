package com.hspedu.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        staff tom = new staff("tom", 300, 22, 1.0);
        manage wang = new manage("wang", 300, 22, 1.2);
        wang.setBonus(3000);
        tom.printSalary();
        wang.printSalary();


    }
}

class empolyee1{
    private String name;
    private double DaySalary;
    private int Day;

    private double leve;

    public empolyee1(String name, double daySalary, int day, double leve) {
        this.name = name;
        DaySalary = daySalary;
        Day = day;
        this.leve = leve;
    }

    public String getName1() {
        return name;
    }

    public void setName1(String name) {
        this.name = name;
    }

    public double getDaySalary1() {
        return DaySalary;
    }

    public void setDaySalary1(double daySalary) {
        DaySalary = daySalary;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public double getLeve() {
        return leve;
    }

    public void setLeve(double leve) {
        this.leve = leve;
    }

    public void printSalary(){
        System.out.println(getName1()+"的工资为"+getDaySalary1()*getDay()*getLeve());
    }
}
class staff extends empolyee1{
    public staff(String name, double daySalary, int day, double leve) {
        super(name, daySalary, day, leve);
    }
    public void printSalary(){
        super.printSalary();
    }

}
class manage extends empolyee1{
    private int bonus;
    public manage(String name, double daySalary, int day, double leve) {
        super(name, daySalary, day, leve);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


    public void printSalary(){
        System.out.println(getName1()+"的工资为"+(getDaySalary1()*getDay()*getLeve()+getBonus()));
    }

}
