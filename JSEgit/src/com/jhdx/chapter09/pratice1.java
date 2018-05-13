package com.jhdx.chapter09;

public class pratice1 {

    public static void main(String[] args) {
        double sum=0;
        for(int i=1;i<=6;){
            int t=(int)(Math.random()*30+2);
            if(t%2==0){
                System.out.print(t+" ");
                i++;
                sum=sum+t;
            }
        }
        System.out.println("平均："+sum/6);
    }
}
