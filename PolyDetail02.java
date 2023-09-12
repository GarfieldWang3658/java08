package com.hspedu.poly_.Detail_;

import com.hspedu.extend.Sub;

public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new sub();
        System.out.println(base.count);//看编译类型，由于编译类型为Base，因此为10
        sub sub = new sub();
        System.out.println(sub.count);//20,编译类型为sub

    }
}
class Base{//父类
    int count = 10;//属性

}
class sub extends Base{//子类
    int count = 20;//属性
}
