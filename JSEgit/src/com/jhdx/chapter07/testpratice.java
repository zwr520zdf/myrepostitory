package com.jhdx.chapter07;

public class testpratice {
    public static void main(String[] args) {
        System.out.println("1------------------");
        pratice1 p1=new pratice1();
        p1.setI(12);
        System.out.println(p1.getI());
        System.out.println("2------------------");
        double x=1.2;
        double y=2;
        pratice2 p2=new pratice2(x,y);
        System.out.println("面积："+p2.Sum());
        System.out.println("2------------------");
        int lengh = args.length;
        if (lengh == 0) {
            System.out.println("无运行参数");
        } else {
            for (int i = 1; i <= args.length; i++) {
                System.out.println(i);
            }
        }
    }
}
