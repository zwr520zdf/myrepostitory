package com.jhdx.chapter12.sl;

public class Demo {
    private String name;
    private int age;
    //属性对应的getter/setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
       Demo d=null;
        //空指针异常
        //System.out.println(d.getName());

        //数字转换异常
        String stuName = " tom" ;
        //int result = Integer.parseInt(stuName);


    }
}
