package com.jhdx.chapter11;
import java.util.Random;

import static java.lang.Math.max;
public class importTest {
    Random random=new Random();
    private final int a1=random.nextInt(5);
    private static final int a2=10;
    public static void main(String[] args) {
        System.out.println("2和3的最大值："+max(2,3));
        importTest i=new importTest();
        System.out.println("a1："+i.a1+" a2: "+i.a2);
        importTest i1=new importTest();
        System.out.println("a1："+i1.a1+" a2: "+i1.a2);

    }
}
