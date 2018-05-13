package com.jhdx.chapter12.pratice;

public class MyException extends Exception{ //自定义异常类
    private  String message; //接受错误信息
    public MyException (String errormsg) { //定义构造方法
        message=errormsg;
    }
    public String getMessage() {
        return message;
    }
}
