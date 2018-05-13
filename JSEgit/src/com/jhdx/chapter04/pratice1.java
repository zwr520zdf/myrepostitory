package com.jhdx.chapter04;

import java.util.Scanner;

public class pratice1 {
    public static void main(String[] args) {
        System.out.println("输入：");
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        if (x%2==0){
            System.out.println("偶数");
        }
        else {
            System.out.println("奇数");
        }
    }
}
