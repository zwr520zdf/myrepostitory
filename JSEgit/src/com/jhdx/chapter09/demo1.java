package com.jhdx.chapter09;

import java.text.DecimalFormat;
import java.util.Random;

public class demo1 {
    public void Sim(String pattern,double value){
        DecimalFormat myFormat=new DecimalFormat(pattern);
        String output=myFormat.format(value);
        System.out.println(output);
    }
    public static void main(String[] args) {
        System.out.println("余弦60°:"+Math.cos(Math.PI/3));
        System.out.println("3的二次方："+Math.pow(3,2));
        System.out.println("3.2向上取整："+Math.ceil(3.2));
        System.out.println("3.2向下取整："+Math.floor(3.2));
        System.out.println("随机数："+(int)(Math.random()*10+1));
        System.out.println("随机字符:"+(char)('a'+Math.random()*('z'-'a'+1)));
        Random random=new Random();
        System.out.println("0~10(不包含10):"+random.nextInt(10));
        demo1 d=new demo1();
        d.Sim("#.#%",0.203);
        d.Sim("#.##",12.342);//根据后一位四舍五入
    }
}
