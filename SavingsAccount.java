package com.hspedu.homework;

public class SavingsAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(double balance) {
        super(balance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //存款
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);//巧妙使用了父类的deposit方法。
            //1块钱入银行的账号
        }
        count--;
    }

    public void withdraw(double amount) {

        if (count > 0) {
            super.deposit(amount);
        } else {

            super.withdraw(amount + 1);
            ////1块钱入银行的账号
        }
        count--;
    }
    public void earnMonthlyInterest(){//每个月初，统计上月利息，同时将count=3
        count = 3;
        super.deposit(getBalance()*rate);
    }
}