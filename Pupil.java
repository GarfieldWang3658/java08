package com.hspedu.extend;

public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score){
        this.score=score;
    }
    public void Testing(){
        System.out.println("学生"+name+"正在考小学数学..");
    }
    public void showInfo(){
        System.out.println("学生名字"+name+" 年龄"+age+" 成绩"+score);
    }
}
