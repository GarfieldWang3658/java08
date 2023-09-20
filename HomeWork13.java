package com.hspedu.homework;

import org.w3c.dom.ls.LSOutput;

public class HomeWork13 {
    public static void main(String[] args) {
        Teacher2 zhanfei = new Teacher2("张飞", "男", 30, 5);
        Student1 xiaoming = new Student1("小明", 15, "男", "00023102");
//        System.out.println(zhanfei.play());
//        zhanfei.teach();
//        System.out.println(xiaoming.play());
//        xiaoming.study();
        zhanfei.printInfo();
        System.out.println("-----------------------");
        xiaoming.printInfo();

        Person55[] person5s = new Person55[4];
        person5s[0] = new Student1("小明", 14, "男", "00023102");
        person5s[1] = new Student1("小红", 15, "女", "00023188");
        person5s[2] = new Teacher2("张飞", "男", 30, 5);
        person5s[3] = new Teacher2("关羽", "男", 35, 8);

        HomeWork13 homeWork13 = new HomeWork13();
        homeWork13.bubbleSort(person5s);
        for (int i = 0; i < person5s.length; i++) {
            System.out.println(person5s[i]);
        }
            System.out.println("===========================");
            for (int i = 0; i < person5s.length;i++) {
                homeWork13.test(person5s[i]);

            }
        }



    public void test(Person55 p) {
        if (p instanceof Student1) {
            ((Student1) p).study();
        } else if (p instanceof Teacher2) {
            ((Teacher2) p).teach();
        } else {
            System.out.println("do nothing...");
        }
    }
        public void bubbleSort (Person55[]person5s){
            Person55 temp = null;
            for (int i = 0; i < person5s.length - 1; i++) {
                for (int j = 0; j < person5s.length - 1 - i; j++) {
                    if (person5s[j].getAge() < person5s[j + 1].getAge()) {
                        temp = person5s[j];
                        person5s[j] = person5s[j + 1];
                        person5s[j + 1] = temp;
                    }



            }
        }
        //方法
    }
}
class Student1 extends Person55 {
//    private String name;
//    private String sex;
//    private int age;
    private String stu_id;

    public Student1(String name, int age, String sex, String stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }



//    public Student1(String name, String sex, int age, int stu_id) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.stu_id = stu_id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }


    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        super.study();
    }
    public String play(){
        return super.play()+"爱踢足球";
    }
   public void printInfo(){
       System.out.println("学生的信息：");
       System.out.println(super.basicInfo());
       System.out.println("学号："+getStu_id());
       this.study();
       System.out.println(this.play());
   }

    @Override
    public String toString() {
        return "Student1{" +
                "stu_id='" + stu_id + '\'' +
                '}'+super.toString();
    }
}
class Teacher2 extends Person55{
//    private String name;
//    private String sex;
//    private int age;
    private int work_age;

    public Teacher2(String name, String sex, int age, int work_age) {
        super(name, age,sex);
        this.work_age = work_age;
    }
    //    public Teacher2(String name, String sex, int age, int work_age) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.work_age = work_age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach(){
       super.teach();
    }
    public String play(){
        return super.play()+"爱玩象棋";
    }
    public void printInfo(){
        System.out.println("学生的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄："+getWork_age());
        this.study();
        System.out.println(this.play());
    }

    @Override
    public String toString() {
        return "Teacher2{" +
                "work_age=" + work_age +
                '}'+super.toString();
    }
}
class Person55 {
    private String name;
    private String sex;
    private int age;

    public Person55(String name, int age, String sex) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void teach() {
        System.out.println("我承诺，我会认真教学");
    }

    public String play() {
        return getName();
    }

    public void study() {
        System.out.println("我承诺，我会好好学习");
    }

    public String basicInfo() {
        return "姓名：" + getName() + "\n年龄：" + getAge() + "\n性别：" + getSex();
    }

    @Override
    public String toString() {
        return "Person55{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}