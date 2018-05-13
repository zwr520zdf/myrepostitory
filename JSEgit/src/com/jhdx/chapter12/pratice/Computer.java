package com.jhdx.chapter12.pratice;

public class Computer {
    //定义count方法
    public static Double count(Double m,Double n) throws MyException{
        if( m <= 0 ||n<=0){
            throw new MyException("传递的参数为负数整数");
        }
        if(m < n){
            Double temp =0.0;
            temp = m;
            m = n;
            n = temp;
        }
        double r = m % n;
        while(r!=0){
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }

    public static void main(String[] args) {
        try {
            double m = 122 , n= -3;
            double r=count(m,n);
            System.out.println(m+" 和 "+n+"的最大共约数是："+r);
        } catch (MyException e) {

            e.printStackTrace();
        }
    }
}
