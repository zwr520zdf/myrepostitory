package com.jhdx.chapter10;

public class Monkey extends Animal {
    public void sleep(){
        //父类的属性必须为public才能用super.去调用
        System.out.println(super.name+"子类睡的方法");
    }

    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.sleep();
        animal1.eat();
        System.out.println("--------");
        Animal animal2=new Monkey();
        animal2.sleep();
        animal2.eat();
        System.out.println("--------");
        Monkey monkey=new Monkey();
        monkey.sleep();
        monkey.eat();

    }
}
