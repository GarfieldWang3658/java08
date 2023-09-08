package com.hspedu.encap;

public class Account {
    private String name;

    private double balance;
    private String password;

    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("输入的名字有误，默认姓名为张三");
            this.name = "张三";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20，默认值21");
            this.balance = 21;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码输入有误，必须为六位数，默认123456");
            this.password = "123456";
        }
    }
    public void showInfo(){
        System.out.println("账号信息，姓名="+name+" 余额="+balance+" 密码="+password);
    }

}