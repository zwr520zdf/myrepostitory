package com.jhdx.chapter08;

public class demo1 {
    public static void main(String[] args) {
        Integer num=new Integer(12);
        Integer num1=new Integer("12");
        String s[]=new String[]{"1","2","3"};
        int sum=0;
        for (String a:s
             ) {
            sum=sum+Integer.parseInt(a);
        }
        System.out.println("数组和:"+sum);
    }
}
