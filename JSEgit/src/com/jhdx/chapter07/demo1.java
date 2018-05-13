package com.jhdx.chapter07;

public class demo1 {
    private int sum;
    final static double PI=3.14;
    static int i=20;
    public demo1(int sum) { //有参构造方法
        this.sum = sum;
        System.out.println(demo1.PI);//调用静态常量
    }
    public void test(){
        i++;
       // static int i=0;不能在方法体中的局部变量声明为静态
    }

    public demo1() {
        System.out.println("创建对象");
    }

    public static void main(String[] args) {
        demo1 d=new demo1();
        demo1 _d=new demo1();      //静态变量在内存中被类 所共享
        System.out.println(d.i);
        d.test();
        System.out.println(_d.i);
        String a1=new String("abc");
        String a2=new String("abc");
        String a3=a1; //a1和a3引用指向同一内存地址
        if(a1==a2)
        System.out.println("相等");
    }
}
