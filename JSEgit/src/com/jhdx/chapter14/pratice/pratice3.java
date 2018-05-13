package com.jhdx.chapter14.pratice;

import java.util.HashMap;
import java.util.Map;

public class pratice3 {
    private String id;
    private String name;

    public pratice3(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        pratice3 p1=new pratice3("011","a");
        pratice3 p2=new pratice3("001","b");
        pratice3 p3=new pratice3("018","c");
        pratice3 p4=new pratice3("015","d");
        Map<String,String> map=new HashMap<>();
        map.put(p1.getId(),p1.getName());
        map.put(p2.getId(),p2.getName());
        map.put(p3.getId(),p3.getName());
        map.put(p4.getId(),p4.getName());
        for (String p:map.values()
             ) {  //无序排列
            System.out.print(p+"\t");
        }
        System.out.println("删除的值："+map.remove("015"));  //根据key删除返回对于的value值
    }
}
