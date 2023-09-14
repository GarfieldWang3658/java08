package com.hspedu.object_;

public class ToString {
    public static void main(String[] args) {
//        Object的toString 源码
        //1、getClass().getName() 类的全类名（包名+类名）
        //2、Integer.toHexString(hashCode());将对象的hashcode值转成16进制字符串
//        public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }
        Monster monster = new Monster("小妖怪","巡山",1000);
        System.out.println(monster.toString()+"\t hashcode"+monster.hashCode());
        System.out.println(monster);//等价调用 monster.toString方法
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
    //重写toString方法，输出对象属性

    @Override
    public String toString() {//重写后一般把对象的属性输出，也可以自己定制。
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
