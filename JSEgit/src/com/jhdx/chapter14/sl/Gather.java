package com.jhdx.chapter14.sl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Gather {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();//创建集合对象
        list.add("happy");
        list.add("new");//添加元素
        list.add("year");
        for (String x:list
             ) {
            System.out.print(x+" ");//遍历出集合
        }
        System.out.println("集合元素的个数"+list.size());
        int i= (int) (Math.random()*list.size()); //返回的double型强转为int型
        System.out.println("索引位置:"+i);
        list.remove(i);//删除指定索引位置的元素
        for (String x1:list
             ) {
            System.out.print(x1+" ");
        }

        System.out.println("---LinkedList---");
        List<Integer> linkedList=new LinkedList<Integer>();//创建linkedList集合对象
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7); //添加元素
        for (Integer a:linkedList
             ) {
            System.out.print(a+"\t");
        }
        System.out.println("\n"+"---插入数据---");
        ((LinkedList<Integer>) linkedList).addFirst(4);//表头插入数据
        ((LinkedList<Integer>) linkedList).addLast(8);//表尾插入数据
        for (Integer a:linkedList
                ) {
            System.out.print(a+"\t");
        }
        /*
            list集合的索引下标从0开始
         */
    }
}
