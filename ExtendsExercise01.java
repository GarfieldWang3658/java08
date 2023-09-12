//package com.hspedu.extend.exercise;
//
//public class ExtendsExercise01 {
//    public static void main(String[] args) {
//        b b = new b();
//        //b-> a ?
//    }
//}
//class a {
//    a(){
//        System.out.println("a");
//    }
//    a(String name){
//        System.out.println("a name");
//    }
//}
//class b extends a{
//    public b() {
//        this("abc");//由于有this 因此无super
//        //调用了本类中，带字符串的构造器，因此执行B(String name)，
//        System.out.println("b");//输出b name之后执行输出b
//    }
//    b(String name){//在执行B(String name)构造器前，
//        // 由于B继承了A，因此执行super（）即A类的无参构造器
////        //因此输出a，输出a之后执行输出b name
//        System.out.println("b name");
//    }
//}
