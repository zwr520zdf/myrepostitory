package com.jhdx.chapter14.sl;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapText {
    private int id;
    private String name;

    public MapText(int id, String name) { //带参构造方法
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();//由HashMap实现Map对象
        MapText mapText1=new MapText(123,"张三");
        MapText mapText2=new MapText(110,"李四");
        MapText mapText3=new MapText(221,"王五");
        MapText mapText4=new MapText(0,null);
        map.put(mapText1.getId(),mapText1.getName());
        map.put(mapText2.getId(),mapText2.getName()); //添加元素
        map.put(mapText3.getId(),mapText3.getName());
        map.put(mapText4.getId(),mapText4.getName());
        for (String name:map.values()
             ) {   //无序的遍历
            System.out.println(name);
        }
        System.out.println("---TreeMap--");
        Map<Integer,String> treeMap=new TreeMap<>();
        treeMap.putAll(map);//添加元素到treeMap中
        for (String name1:treeMap.values()
             ) {  //升序遍历
            System.out.println(name1);
        }
    }
}
