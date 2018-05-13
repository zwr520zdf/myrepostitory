package com.jhdx.chapter14.sl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapStu {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>(); //由HashMap实现Map对象
        map.put(501,"张三");//放入元素
        map.put(502,"李四");
        map.put(503,"王五");
        for ( int id:map.keySet()
             ) {
            System.out.println(id);  //遍历key值
        }
        for (String name:map.values()
             ) {
            System.out.println(name);
        }

    }

}
