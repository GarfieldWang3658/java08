package com.use;

import com.xiaoqiang.Dog;
//import  com.xiaoming.Dog;同时引入会无法区分，所以第二个开始用包名来区分
public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog);//com.xiaoqiang.Dog@28a418fc

        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();//明确用包名来区分
        System.out.println(dog1);//com.xiaoming.Dog@1f32e575
    }
}