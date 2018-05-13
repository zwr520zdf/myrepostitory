package unit17.sl;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String stuName;
    private Integer age;  //定义属性变量

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
        //统一集合List中元素的数据类型是Student类型
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student();
        stu1.setStuName("tom");
        stu1.setAge(20);
        Student stu2 = new Student();
        stu2.setStuName("jack");
        stu2.setAge(19);
        list.add(stu1);
        list.add(stu2);
        //list.add("java oop");//不允许将String类型元素添加至集合中
        for(int i=0;i<list.size();i++){
            System.out.print("姓名:"+list.get(i).getStuName()+" ");
            System.out.println("年龄:"+list.get(i).getAge());     }

    }

}
