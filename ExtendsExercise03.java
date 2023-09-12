package com.hspedu.extend.exercise;

import javax.xml.crypto.OctetStreamData;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC a = new PC("AMD","16","500","TOSHBA");
        a.printInfo();

        NotPad ipad = new NotPad("A12","12","128","Gold");
        ipad.NotePadInfo();


    }
}
class Computer{
    private String CPU;
    private String RAM;
    private String HDD;

    public Computer(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;


    }

    public String getCpu() {
        return CPU;
    }

    public void setCpu(String cpu) {
        this.CPU = cpu;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }
    public String getDetails(){
        return " CPU=" + CPU + " RAM=" + RAM + " HDD=" + HDD;
    }

}
class PC extends Computer{

    //继承设计的基本思想，父类的构造器完成父类属性的初始化，
    //子类的构造器完成子类属性的初始化
    private String Brand;
    public PC(String cpu, String RAM, String HDD, String brand) {
        super(cpu, RAM, HDD);
        Brand = brand;
    }
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息=");
        System.out.println(getDetails()+"brand="+Brand);
    }
}
class NotPad extends Computer{
    private String color;

    public NotPad(String cpu, String RAM, String HDD, String color) {
        super(cpu, RAM, HDD);
        this.color = color;
    }
    public void NotePadInfo(){
        System.out.println("NotPad信息=");
        System.out.println(getDetails()+" color="+color);
    }
}

