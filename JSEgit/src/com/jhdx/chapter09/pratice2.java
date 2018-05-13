package com.jhdx.chapter09;

import java.text.DecimalFormat;

public class pratice2 {
    static public void SimpleFormat(String pattern, double value) {	//使用实例化对象时设置格式化模式
        DecimalFormat myFormat = new DecimalFormat(pattern);	//实例化DecimalFormat对象
        String output = myFormat.format(value);				//将数字进行格式化
        System.out.println(output);
    }

    public double Yuan(double r){
        return Math.PI*Math.pow(r,2);
    }
    public static void main(String[] args) {
        pratice2 p=new pratice2();
        SimpleFormat("#.##",p.Yuan(2));
    }
}
