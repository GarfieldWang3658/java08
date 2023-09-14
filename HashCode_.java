package com.hspedu.object_;


public class HashCode_ {
    public static void main(String[] args) {
    ABC aa = new ABC();
    ABC aa2 = new ABC();
    ABC aa3 = aa;
    System.out.println("aa "+aa.hashCode());
    System.out.println("aa2 "+aa2.hashCode());
    System.out.println("aa3 "+aa3.hashCode());
    }
}
class ABC{

}
