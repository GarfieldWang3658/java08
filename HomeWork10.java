package com.hspedu.homework;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor TOM = new Doctor("TOM", 33, "门诊", "专家", 10000);
        Doctor WANG = new Doctor("wang", 35, "内科", "主任", 12000);
        System.out.println(TOM.equals(WANG));


            }
        }
class Doctor{
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;

    public Doctor(String name, int age, String job, String gemder, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGemder() {
        return gender;
    }

    public void setGemder(String gemder) {
        this.gender = gemder;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;}
        if (!(obj instanceof Doctor)) {
            return false;
        }
        //向下转型因为obj的运行类型是Doctor，或其子类
        Doctor doctor = (Doctor)obj;
        return this.name.equals(doctor.name)&&this.age==doctor.age&&
                this.gender.equals(doctor.gender)&&this.job.equals(doctor.job)&&
                this.sal==doctor.sal;
    }
}
