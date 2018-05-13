package com.jhdx.chapter06;


import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int arr[]=new int[3];
        String arr1[]=new String[2];
        for(int a:arr){
            System.out.println(a);
        }
        for(String b:arr1){
            System.out.println(b);
        }
        System.out.println("---二维数组----");
        int a[][]=new int[][]{{1},{1,2},{1,2,3}};
        for (int x[]:a
             ) {
            for (int y:x
                 ) {
                System.out.print(y+",");
            }
        }
        System.out.println();
        System.out.println("---数组填充----");
        int arr3[]=new int[]{1,2,3,4};
        Arrays.fill(arr3,0,2,6);
        for (int a1:arr3
             ) {
            System.out.print(a1+",");
        }
        System.out.println();
        System.out.println("---数组排序----");
        int y[]=new int[]{2,1,4,6,5};
        Arrays.sort(y);
        for (int a1:y
             ) {
            System.out.print(a1+" ");
        }
        System.out.println();
        System.out.println("---冒泡排序----");
        for(int i=0;i<y.length;i++){
            for(int j=0;j<y.length-1;j++){
                if(y[j]>y[j+1]){
                    int temp=y[j];
                    y[j]=y[j+1];
                    y[j+1]=temp;
                }
            }
        }
        for (int t:y
             ) {
            System.out.print(t+" ");
        }
    }



}
