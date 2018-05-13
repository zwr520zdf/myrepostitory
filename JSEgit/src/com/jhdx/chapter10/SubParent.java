package com.jhdx.chapter10;

public class SubParent extends Parent{
    public SubParent() {
        super(2);
        System.out.println("调用子类的SubParent()方法");
        System.out.println(getClass().getName());
    }
}
