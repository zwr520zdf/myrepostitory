package com.jhdx.chapter12.sl;

public class MyException extends Exception {//继承Exception类
    public MyException(String ErrorMessage) {  //创建构造方法
        super(ErrorMessage);  //调用父类构造方法
    }
}
