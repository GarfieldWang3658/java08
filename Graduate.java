package com.hspedu.extend;

public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score){
        this.score=score;
    }
    public void Testing(){//和pupil不一样
        System.out.println("大学生"+name+"正在考大学数学..");
    }
    public void showInfo(){
        System.out.println("学生名字"+name+" 年龄"+age+" 成绩"+score);
    }
}
