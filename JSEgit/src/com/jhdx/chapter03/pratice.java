package com.jhdx.chapter03;

public class pratice {
    static int age=3;
    public static void test() {
        age = 30;
        String name = "jack";
    }

    public static void main(String[] args) {
        //1
        int x=10;
        double y=2;
        System.out.println("x+y="+(x+y));

        //局部变量不可用于主方法中
       // System.out.println(name+age);
        //
        long l = 45789;
        byte b = 123;
        short s = 32564;
        int i1 = (int) l;
        int i2 = (int) s;
        int i3 = (int) b;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
