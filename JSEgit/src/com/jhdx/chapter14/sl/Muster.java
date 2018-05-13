package com.jhdx.chapter14.sl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>(); //实例化集合类
        list.add("a");                  //添加数据
        list.add("b");
        list.add("c");
        Iterator<String> it=list.iterator(); //迭代器
        while(it.hasNext()){           //判断是否有下一个元素
            String str=it.next();         //Iterator中的next方法返回Oject
            System.out.println(str);
        }
    }
}
