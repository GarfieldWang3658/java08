package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SmallChangeSys {
    //1、完成菜单，并可以选择菜单给出对应提示
    //2、完成零钱通明细
    //3、完成收益入账
    //4、消费
    //5、退出
    //6、用户输入4退出时，给出提示"你确定退出码？"
    //7、消费入账是判断金额是否合理

    public static void main(String[] args) {
        //定义相关变量
        boolean loop = true;
        Scanner myscanner = new Scanner(System.in);
        String key ="";
        //完成零钱通明细
        //（1）可以把收益入账和消费，保存到数组
        //（2）可以使用对象
        //（3）简单的话可以使用Str拼接
        String details="----------零钱通明细----------";

        //完成收益入账，完成功能驱动程序员增加新的变化和代码
        //定义新变量

        String note = null;

        double money = 0;
        double balance = 0;
        Date date = null;//date 是java.util.Date类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");//可以用于日期格式化


        do {
            System.out.println("==========零钱通菜单==========");

            System.out.println("\t\t 1、零钱通明细");
            System.out.println("\t\t 2、收益入账");
            System.out.println("\t\t 3、消   费");
            System.out.println("\t\t 4、退   出");

            System.out.println("请选择（1-4）");
            key = myscanner.next();
            //switch分支控制
            switch (key){
                case"1":
                    System.out.println(details);
                    break;

                case"2":
                    //System.out.println("2、收益入账");
                    System.out.println("收益入账金额：");
                    money = myscanner.nextDouble();
                    //money的值范围，应该校验一下
                    //找出不正确的金额的条件，给出提示即可，就直接break；
                    if (money<=0){
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息到到Details
                    date = new Date();//获取当前日期

                    details  += "\n收益入账\t+"+money+"\t"+sdf.format(date)+"\t"+balance;
                    break;
                case"3":
                    //System.out.println("3、消   费");
                    System.out.println("消费金额");
                    money = myscanner.nextDouble();
                    if (money<=0||money>balance){
                        System.out.println("消费金额应该在0-"+balance);
                        break;
                    }
                    System.out.println("消费说明");
                    note = myscanner.next();
                    balance-=money;
                    date = new Date();
                    details += "\n"+note +"\t-"+money+"\t"+ sdf.format(date)+"\t"+balance;
                break;
                case"4":
                    //（1）定义一个变量，choice，接收一个用户的输入
                    //System.out.println("4、退   出");
                    String choice = "";
                    while (true) {
                        System.out.println("你确定要退出码？y/n");
                        choice = myscanner.next();
                        if ("y".equals(choice)||"n".equals(choice)) {
                            break;
                        }
                    }
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;

                default:
                    System.out.println("菜单选择有误，请重新选择。");


            }

        }while (loop);
        System.out.println("----------退出了零钱通项目----------");
    }
}
