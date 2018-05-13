package com.jhdx.chapter05;

import java.util.Scanner;

public class pratice1 {
    public static void main(String[] args) {
        String str=new String ("a1B2c3D4");
        System.out.println("小写"+str.toLowerCase());
        System.out.println("大写"+str.toUpperCase());
        System.out.println("---------------------");
        String str1=new String("x1B2c3y4");
        if(str.substring(2,5).equals(str1.substring(2,5))){
            System.out.println("两个子字符串相同");
        }
        else {
            System.out.println("两个子字符串不相同");
        }
        System.out.println("---------------------");

         String reg="1[35]\\d{9}";
        System.out.println("输入手机号");
        Scanner in=new Scanner(System.in);
        String text=in.nextLine();

        if(text.matches(reg)){
            System.out.println(text + "是合法的手机号");
        }
        else{
            System.out.println(text + "不是合法的手机号");
        }

        System.out.println("---------------------");

        StringBuffer bf=new StringBuffer("hello");
        System.out.println(bf);
        bf.append(123456);
        System.out.println("追加："+bf.toString());
    }


}
