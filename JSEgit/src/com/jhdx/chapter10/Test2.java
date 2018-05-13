package com.jhdx.chapter10;

public class Test2 extends Test {
    public Test2() {
        super();
        super.doSomething();
    }
    public void doSomething(){
        //重写doSomething的方法
    }
    public Test2 dolt(){
        return new Test2();//重写父类方法
    }
}
