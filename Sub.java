package com.hspedu.extend;

public class Sub extends Base{
    public Sub(String name,int age){
        //1、调用父类的无参构造器
        //super();//或什么也不写，默认
        //2、调用父类的Base(String name)构造器
        //3、要调用父类Base(String name，int age)构造器
        super("wangyang",35 );
        System.out.println("子类Sub(String name,int age)构造器被调用");
    }
    public Sub(){//子类构在器
        //super();//系统会默认调用父类的无参构造器
        super("jack",10);//使用了带参数构造器
        System.out.println("子类sub构造器被调用");
    }
    public Sub(String name){
        super("smith",30);
        System.out.println("子类的String name构造器被调用");

    }
    public void sayok(){//子类方法
        //非私有的属性和方法可以直接访问
        System.out.println(n1+" "+n2+" "+n3+" ");//无法+n4，因为n4是私有属性
        test100();
        test200();
        test300();
        //test400(); 无法访问私有方法
        //通过父类提供的公共的方法去访问
        System.out.println("n4="+getN4());
        callTest400();//
    }
}
