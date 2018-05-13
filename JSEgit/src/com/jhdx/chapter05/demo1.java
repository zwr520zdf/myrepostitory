package com.jhdx.chapter05;

import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        String str=new String("hello");
        System.out.println(str);
        System.out.println(str.lastIndexOf(""));/*当lastIndexOf("")为空返回字符串长度*/
        System.out.println(str.charAt(1)); //下标从1开始
        System.out.println(str.length());
        System.out.println(str.indexOf("o"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(2,3));//从固定位置开始截取
        System.out.println("--------------------------");

        String s=new String ("  hello world  ");//忽略前导和尾部空格
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s.replace("o","a"));
        System.out.println(s.startsWith("h"));
        System.out.println(s.trim().endsWith("d"));
        System.out.println("--------------------------");

        String str1=new String("hello");
        System.out.println(str1==str);
        System.out.println(str1.equals(str));
        System.out.println("--------------------------");

        str="192.168.1.1";
        String[] firststr=str.split("\\.");
        for(String x:firststr){
            System.out.print(x+" ");
        }
        String[] secstr=str.split("\\.",3);
        for(String x:secstr){
            System.out.print(x+" ");
        }
        System.out.println("--------------------------");
        Date date=new Date();
        System.out.println(date);
        str=String.format("%tr",date);
        System.out.println(str);



    }
}
