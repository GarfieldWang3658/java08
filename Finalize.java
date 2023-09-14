package com.hspedu.object_;

public class Finalize {
    public static void main(String[] args) {
        Car bmw = new Car("宝马110");
        bmw = null;//这时 car对象就是一个垃圾，垃圾回收器就会回收（销毁）对象
        //对象销毁前，就会调用该对象的finalize方法，程序员就可以在finalize中，写自己的业务逻辑代码
        //比如：释放数据库资源，或者打开文件。。。。
        //如果程序员不重写finalize方法，那么机会调用object类的finalize方法，即默认处理。
        //如果程序员重写了finalize方法，就可以实现自己的逻辑了。
        System.gc();
        System.out.println("程序退出。。");
    }
}
class Car{
    private String name;
    public Car(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我门销毁汽车"+name);
        System.out.println("释放资源。。。");
    }
}
