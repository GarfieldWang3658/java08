package com.hspedu.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a==c);
        System.out.println(b==c);
        A obj = a;
        System.out.println(obj==c);

        int num1 = 10;
        double num2 =10.0;
        System.out.println(num1 == num2);//基本数据类型，判断值是否相等

        //equlas 方法怎么看源码
        "hello".equals("abc");
        //object类的 equlas
       //即 Object的equlas的方法默认就是比较判断两个对象是否相同
        //也就是判断两个对象是不是同一个对象

        Integer integer1 = new Integer(1000);
        //从源码可以看到 Integer也重写了Object的equlas方法，
        //变成了判断两个值是否相同。
        Integer integer2 = new Integer(1000);
        System.out.println(integer1==integer2);
        System.out.println(integer1.equals(integer2));

        String str1 = new String("123");
        String str2 = new String("123");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


    }
}
class A{}
