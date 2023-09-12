package com.hspedu.poly_.Detail_;

import java.nio.ByteBuffer;

public class PolyDetail03 {
    public static void main(String[] args) {


        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//ture
        System.out.println();
        //编译类型为AA，运行类型为BB
        AA aa = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//ture
        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        String str = "hello";
        System.out.println(str instanceof Object);//ture

    }
}
class AA{

}

class BB extends AA{

}
