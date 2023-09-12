package com.hspedu.poly_.Detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //父类的引用指向了子类的对象，向上转型
        //父类引用了子类对象
        Animal animal = new Cat();

        Object obj = new Cat();
        //可以调用父类中的所有成员（遵守访问权限）；
        //不能调用子类中特有成员；
        //因为在编译阶段，能调用哪些成员，是由编译类型来决定的；
        //animal.catchMouse();是错误的
        //最终运行效果看子类（运行类型）的具体实现，即调用方法时，
        // 按照从子类（运行类型）开始查找方法
        //然后调用，方法调用规则和之前的一致。
        animal.sleep();//睡
        animal.eat();//猫吃鱼
        animal.run();//跑
        animal.show();//hello 你好

        //多态向下转型
        //调用cat的抓老鼠方法
        //（1）子类类型 引用名 = （子类类型）父类引用
        //cat的编译类型是Cat
        //运行类型是Cat
        //因为编译类型变成了Cat 所以可以调用Cat中所有的方法。
        //运行类型也是Cat，所以从Cat类中优先寻找对应方法。
        Cat cat = (Cat) animal;
        cat.catchMouse();
        //（2）要求父类的引用必须指向当前目标类型的对象
        //要求animal原先指向就是Cat
        //Dog dog = (Dog)animal;


        System.out.println("ok~~");


    }
}
