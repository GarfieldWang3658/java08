package com.hspedu.object_;

public class EqulasExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack",10,'男');
        Person person2 = new Person("jack",10,'男');

        System.out.println(person1.equals(person2));

    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    //重写 object的equals方法

    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj instanceof Person){//确认都是Person类，才比较
            //进行类型转换，向下转型,因为需要得到obj的各个属性。
            Person p = (Person)obj;
            return this.name.equals(p.name)&&this.age == p.age&&this.gender==p.gender;


        }
        //如果不是Person直接返回false
            return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
