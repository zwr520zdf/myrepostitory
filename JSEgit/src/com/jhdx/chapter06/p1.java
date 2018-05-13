package com.jhdx.chapter06;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        int arr1[]=new int[]{2,3,4,1,5,6};
        int arr2[]=Arrays.copyOfRange(arr1,0,3);
        for (int x=0;x<arr2.length;x++){
            System.out.println(arr2[x]+" ");
        }
        System.out.println("-------------");
        Arrays.sort(arr1);
        System.out.println(arr1[0]);
        System.out.println("-------------");
        String arr[]=new String[]{"a","d","e","f","g"};
        Arrays.fill(arr,2,3,"bb");
        for (String a:arr
             ) {
            System.out.print(a+" ");
        }
        System.out.println("");
        System.out.println("--------------");
        int arr3[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3.length;j++){
                System.out.print(arr3[j][i]+" ");
            }
            System.out.println("");
        }
    }

}
