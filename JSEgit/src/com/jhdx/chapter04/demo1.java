package com.jhdx.chapter04;

public class demo1 {
    public static void main(String[] args) {
       /* L:for(int x=1;x<2;x++){
            for (int y=0;y<5;y++){
                if (y==3){
                    break L;
                }
                System.out.println((x+y));
            }
        }*/

        L:for(int x=1;x<3;x++){
            for (int y=0;y<5;y++){
                if (y==3){
                    continue L;
                }
                System.out.println((x+y));
            }
        }
    }
}
