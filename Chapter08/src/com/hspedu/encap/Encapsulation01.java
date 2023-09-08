package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        //如果要使用快捷键运行，需要先配置主类。
        //如果没有，第一次使用鼠标点击的形式运算程序，后面就可以用了。
        Person person=new Person();
        person.name = "jackelizabesu";
        person.setName("jacklizabesu");//把jack设置给person对象
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.Info());
        System.out.println(person.getSalary());
        //如果直接使用构造器指定属性
        Person smith = new Person("smith",200,50000);
        System.out.println("======smith======");
        System.out.println(smith.Info());
    }
}
class Person{
    public String name;//名字公开
    private int age;//年龄 私有化
    private  double salary;//工资 私有化

    public Person() {
    }
    //有三个属性的构造器，
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以讲set方法写在构造器中，这样仍然可以验证
        setName(name);//等价于this.
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name){
        //加入对数据的较验
        //增加了业务逻辑。
        if (name.length()>=2&&name.length()<=6){
            this.name=name;
        }else {
            System.out.println("名字的长度不对，需要（2-6）个字符，默认名字");
            this.name="无名人";
        }
    }
    public String getName(){
        return name;
    }
    //手写 get和set 太慢，可以使用快捷键。
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age>=1&&age<=120) {
            this.age = age;
        }else{
            System.out.println("你设置的年龄不对，需要在1-120之间，默认年龄18");
            this.age = 18;//给一个默认年龄
        }
    }
    public double getSalary() {
        //可以增加对当前对象的权限判断。
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法返回信息属性
    public  String Info(){
        return "信息为 name="+name+" age="+age+" salary="+salary;
    }
}
