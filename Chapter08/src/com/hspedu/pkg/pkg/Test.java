package com.hspedu.pkg.pkg;

import com.hspedu.pkg.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);
        //在不同包下可以访问public修饰的属性和方法，
        //但是不能访问其他修饰符，
        }
}
