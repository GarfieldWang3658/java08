package com.hspedu.poly_.dynamic_;





public class DynamicBinding {
    public static void main(String[] args) {
        AAAA a = new B();
        System.out.println(a.sum());//40-》30
        System.out.println(a.sum1());//30-》20
    }

}
class AAAA{
    public int i =10;
    //动态绑定
    public int sum(){
        return getI()+10;
    }
    public int sum1 (){
        return i + 10;
    }
    public int getI(){
        return i;
    }

}
class B extends AAAA{
    public int i = 20;
//    public int sum(){
//        return i +20;
//    }
    public int getI(){
        return i;
    }
//    public int sum1(){
//        return i+10;
//    }
}
