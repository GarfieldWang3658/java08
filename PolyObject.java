package com.hspedu.poly_.objpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //对象多态的特点
        //animal编译类型是Animal，运行类型是Dog
        Animal animal = new Dog();
        animal.cry();//因为运行时，这时就是执行到该行时，
        // animal的运行类型是Dog，所以cry就是Dog cry
        //执行小狗汪汪叫

        //animal编译类型是Animal，运行类型就是Cat
        animal = new Cat();
        animal.cry();//小猫 喵喵叫


    }

}
