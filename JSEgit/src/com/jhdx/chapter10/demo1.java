package com.jhdx.chapter10;

public class demo1 {

    public static void main(String[] args) {
        Subroutine s=new Subroutine();
        String a1="abc";
        String a2="abc";
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        String b1=new String("123");
        String b2=new String("123");
        String b3=b1;
        System.out.println("-------------");
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println(b2==b3);
        System.out.println(b1.equals(b3));
    }
}
