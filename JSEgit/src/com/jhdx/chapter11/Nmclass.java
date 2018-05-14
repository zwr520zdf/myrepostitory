package com.jhdx.chapter11;
class A{
    class B{

    }
}
public class Nmclass extends A.B{//继承内部类B
            public Nmclass(A a){
                a.super();
            }
}
