package com.hspedu.smallchange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//该类是完成零钱通的各个功能的类
//使用OOP（面向对象编程）
//将各个功能对应一个方法
public class SmallChangeSysOOP {

        //定义相关变量
        boolean loop = true;
        Scanner myscanner = new Scanner(System.in);
        String key = "";
        //完成零钱通明细
        //（1）可以把收益入账和消费，保存到数组
        //（2）可以使用对象
        //（3）简单的话可以使用Str拼接
        String details = "----------零钱通明细----------";

        //完成收益入账，完成功能驱动程序员增加新的变化和代码
        //定义新变量
        String note = null;
        double money = 0;
        double balance = 0;
        Date date = null;//date 是java.util.Date类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");//可以用于日期格式

    public void mainMenu() {
        do {
            System.out.println("========OOP版零钱通菜单========");

            System.out.println("\t\t 1、零钱通明细");
            System.out.println("\t\t 2、收益入账");
            System.out.println("\t\t 3、消   费");
            System.out.println("\t\t 4、退   出");

            System.out.println("请选择（1-4）");
            key = myscanner.next();
            //switch分支控制
            switch (key) {
                case "1":
                   this.detail();
                   break;

                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;

                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("菜单选择有误，请重新选择。");
            }
        } while (loop);
    }

    public void detail() {
        System.out.println(details);
    }

    public void income() {
        System.out.println("收益入账金额：");
        money = myscanner.nextDouble();
        //money的值范围，应该校验一下
        //找出不正确的金额的条件，给出提示即可，就直接break；
        if (money <= 0) {
            System.out.println("收益入账金额需要大于0");
            return;//退出方法不再执行后面的代码
        }
        balance += money;
        //拼接收益入账信息到到Details
        date = new Date();//获取当前日期

        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;

    }

    public void pay() {
        System.out.println("消费金额");
        money = myscanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该在0-" + balance);
            return;
        }
        System.out.println("消费说明");
        note = myscanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + " \t-" + money + "\t" + sdf.format(date) + "\t" + balance;

    }

    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("你确定要退出码？y/n");
            choice = myscanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
