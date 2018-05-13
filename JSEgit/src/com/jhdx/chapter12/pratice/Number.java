package com.jhdx.chapter12.pratice;

import java.util.Scanner;

public class Number {
    //定义count方法
    public Double count(Double x,Double y){
        return x*y;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);//控制台输入
        System.out.println("输入数1：");
        Double x=in.nextDouble();
        System.out.println("输入数2：");
        Double y=in.nextDouble();
        Number number=new Number();//实例对象
        try {
            Double sum=number.count(x,y); //可能发生异常的代码
            System.out.println("乘积："+sum);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
