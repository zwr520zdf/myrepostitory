package com.jhdx.chapter04;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("输入乘法表：");
        int num=in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }

}
