package com.jhdx.chapter14.pratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class pratice2 {
    public static void main(String[] args) {
        //Set集合中添加一下元素
        Set<String> set=new HashSet<>();//利用HashSet实现类
        set.add("A");
        set.add("a");
        set.add("c");   //添加元素
        set.add("a");  //重复的元素添加不成功
        set.add("C");
        for (String s:set
             ) {
            System.out.println(s);
        }
    //List集合中添加一下元素
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("a");
        list.add("c");
        list.add("a");  //重复元素添加成功
        for (String s:list
                ) {
            System.out.println(s);
        }
    }
}
