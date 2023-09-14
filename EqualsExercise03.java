package com.hspedu.object_;

public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fi = 65.0f;
        System.out.println(it==fi);//T
        char ch1 = 'A';
        char ch2 = 12;
        System.out.println(it==ch1);//T
        System.out.println(12==ch2);//T

        String str1 = new String("HELLO");
        String str2 = new String("HELLO");
        System.out.println(str1==str2);//F

        System.out.println(str1.equals(str2));//T String 已经把object类重写了
       // System.out.println("hello"== new java.sql.Date());//F 编译报错
    }
}
