package com.hspedu.extend;

public class Extends01 {
    public static void main(String[] args) {
        Pupil a = new Pupil();
        a.name="xiaoming";
        a.age=10;
        a.Testing();
        a.setScore(50);
        a.showInfo();

        Graduate g = new Graduate();
        g.name="wang";
        g.age=20;
        g.Testing();
        g.setScore(70);
        g.showInfo();
    }
}
