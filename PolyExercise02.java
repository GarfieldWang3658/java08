package com.hspedu.poly_.Exertcise_;

import com.hspedu.extend.Sub;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub1 s = new Sub1();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;
        System.out.println(b==s);//T
        System.out.println(b.count);//10
        b.display();//20，
        // 由于 Base b =(Sub)s,运行类型是sub，所以在Sub运行，因此为20。
    }
}
class Base{//父类
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}
class Sub1 extends Base{//子类
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }

}
