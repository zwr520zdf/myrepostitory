package com.jhdx.chapter10;

public class apple extends Food{
    private int sum=1;
    public apple() {
        System.out.println("apple构造方法");
    }
    public void num(){
        System.out.println("sum:"+sum);
    }

    public static void main(String[] args) {
        Food food=new apple();
        food.test();
        food.num();  //方法名相同，具体调用哪个方法由对象的实际类型决定
        System.out.println(((apple) food).sum);
    }
}
