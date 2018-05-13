package com.jhdx.chapter14.pratice;

import java.util.ArrayList;
import java.util.List;

public class pratice1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();  //利用ArrayList实现List集合对象
        for (int i=1;i<=100;i++){
            list.add(i);
        }
        System.out.println("移除索引位置为10的元素为："+list.get(10));
        list.remove(10);
    }
}
