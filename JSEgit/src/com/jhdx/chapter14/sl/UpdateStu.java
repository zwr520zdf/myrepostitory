package com.jhdx.chapter14.sl;


import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class UpdateStu implements Comparable{
    private int id;
    private String name;  //定义学号和姓名

    public UpdateStu(int id, String name) {   //创建带参构造方法
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

    /*
    TreeSet是用TreeMap来实现的，他是按照一定顺序存放的，这个排序的依据就是所存放元素的compareTo方法，放第一个的时候无需跟任何元素比较，所以不报错，但是从第二个开始就要比较以决定放置的位置了，这时候就要调用compareTo方法，怎么调用compareTo方法呢，只有将类强制转换为Comparable类型之后才能调用啊，
        实现接口重写compareTo方法
        该对象小于、等于、大于指定对象返回-1，0,1
     */
    public int compareTo(Object o) {
        UpdateStu stu=(UpdateStu)o;
        int x=id>stu.id?1:(id==stu.id?0:-1);
        return x;
    }
    public static void main(String[] args) {
        UpdateStu updateStu=new UpdateStu(021,"老大");
        UpdateStu updateStu1=new UpdateStu(002,"老二");
        UpdateStu updateStu2=new UpdateStu(033,"老三");//创建UpdateStu对象
        UpdateStu updateStu3=new UpdateStu(004,"老四");
        Set<UpdateStu> tree=new TreeSet<>();
        tree.add(updateStu);  //对象存入集合中
        tree.add(updateStu1);
        tree.add(updateStu2);
        tree.add(updateStu3);
      /*  Iterator<UpdateStu> it =tree.iterator();  //迭代器
        while (it.hasNext()){
            UpdateStu stu=it.next();
               System.out.println(stu.getId()+" "+stu.getName());
        }*/
        System.out.println("遍历集合所有的元素");
        for (UpdateStu s:tree  //遍历对象
                ) {
            System.out.println(s.getId()+s.getName());
        }
        System.out.println("截取排在..前面的部分的集合");
     /* tree= (TreeSet<UpdateStu>) tree.headSet(updateStu);
        for (UpdateStu s1:tree
             ) {
            System.out.println(s1.getId()+s1.getName());
        }*/
      /*  System.out.println("截取排在..与..之间的部分的集合");

        tree=((TreeSet<UpdateStu>) tree).subSet(updateStu1,updateStu2);
        for (UpdateStu s2:tree
                ) {
            System.out.println(s2.getId()+s2.getName());
        }*/
        System.out.println("排在...之后");
        tree=((SortedSet<UpdateStu>) tree).tailSet(updateStu3);
        for (UpdateStu s2:tree
                ) {
            System.out.println(s2.getId()+s2.getName());

        }

    }
}
