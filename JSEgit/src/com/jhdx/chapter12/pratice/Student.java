package com.jhdx.chapter12.pratice;

import java.util.Scanner;

public class Student {
    public void speak(int m)throws MyException{
        System.out.println("声明speak方法");
        //定义方法抛出异常
        if(m>1000){
            throw new MyException("m大于1000");
        }

    }

    public static void main(String[] args) {
       Student stu=new Student(); //声明对象
        Scanner in=new Scanner(System.in);
        System.out.println("输入参数值：");
        int num=in.nextInt();
            try {
                stu.speak(num); //包含可能发生异常的方法
            } catch (MyException e) {
                System.out.println(e.getMessage());//输出异常的信息
            }

        }


}
