package com.jhdx.chapter08;

public class pratice1 {
    public static void main(String[] args) {
        System.out.println("----1.-----");
        Integer num=1;
        System.out.println(num);
        System.out.println(num.intValue());
        System.out.println("----2.-----");
        Character c1=new Character('a');
        Character c2=new Character('a');

        if(c1==c2){
            System.out.println("相等");
        }  else {
            System.out.println("不相等");
        }
        c1=Character.toUpperCase(c1);
        c2=Character.toUpperCase(c2);
        System.out.println("c1:"+c1+" c2:"+c2);
        if (c1==c2){
            System.out.println("相等");
        }
        else {
            System.out.println("不相等");
        }
        System.out.println("----3.-----");
        Boolean b=new Boolean("abc");
        System.out.println(b);
        b=new Boolean("true");
        System.out.println(b);

    }
}
