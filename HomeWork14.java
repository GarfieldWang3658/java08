package com.hspedu.homework;

public class HomeWork14 {
    public static void main(String[] args) {
        CCCC c = new CCCC();
    }
}
class AAAA{
    public AAAA(){
        System.out.println("AAAA");

    }
}
class BBBB extends AAAA{
    public BBBB(){
        System.out.println("BBBB无参构造器");
    }
    public BBBB(String name){
        System.out.println(name+"BBBB有参构造器");
    }
}
class CCCC extends BBBB{
    public CCCC(){
        this("hello");
        System.out.println("CCCC无参构造器");
    }
    public CCCC(String name){
        super("hahaha");
        System.out.println("CCCC有餐构造器");
    }

}


