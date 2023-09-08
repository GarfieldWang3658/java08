package com.hspedu.extend.improve;

import com.hspedu.extend.Graduate;
import com.hspedu.extend.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.hspedu.extend.Pupil a = new Pupil();
        a.name="daduo";
        a.age=10;
        a.Testing();
        a.setScore(50);
        a.showInfo();

        com.hspedu.extend.Graduate g = new Graduate();
        g.name="wangyang";
        g.age=20;
        g.Testing();
        g.setScore(70);
        g.showInfo();
    }
}
