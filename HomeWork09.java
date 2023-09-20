package com.hspedu.homework;

public class HomeWork09 {
    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint("BLACK", 112.33, 150.11);
    }
}
class Point{
    private double X;
    private double Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
}
class LabeledPoint extends Point{
    private String name3;

    public LabeledPoint( String name3,double x, double y) {
        super(x, y);
        this.name3 = name3;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }
}
