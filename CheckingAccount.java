package com.hspedu.homework;

public class CheckingAccount extends BankAccount {//新的账号
    public CheckingAccount(double balance) {
        super(balance);
    }
    //存款

    public void deposit(double amount) {
        super.deposit(amount-1);//巧妙使用了父类的deposit方法。
        //1块钱入银行的账号
    }

    //取款
    public void withdraw(double amount) {
        super.withdraw(amount+1);
        ////1块钱入银行的账号
    }
}
