package com.hspedu.pkg.pkg;

import java.util.Arrays;

//注意：我们需要使用哪个类就导入相应的类即可，不建议使用*的方式
//import java.util.Scanner;//表示只会引入java.util包下的Scanner类
//import java.util.*//表示引入java.util包下的所有类都引入（导入）。
public class Import01 {
    public static void main(String[] args) {
        //使用系统提供的arrys 完成数组排序
        int[]arr ={-1,20,2,13,3};
        //比如对其进行排序
        //传统的方法是 自己编写排序法】
        //系统提供了相关的类，可以方便完成Arrays

        Arrays.sort(arr);
        //输出排序结果
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");


        }

    }
}
