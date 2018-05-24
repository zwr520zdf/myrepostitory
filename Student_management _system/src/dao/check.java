package dao;


import entity.stuscore;

import java.util.List;
import java.util.Scanner;

public class check {//校验类
    Scanner in=new Scanner(System.in); //创建控制台输入对象
    private Integer i=0;     //分数变量
    private String stunum; //学号变量

    //学号校验
    public String stunumCheck(){
        while (true){
            System.out.print("输入学号：");
            stunum = in.next();
            StudentDao sd=new StudentDao();
            List<stuscore> list=sd.getscore(stunum);
            if(!list.isEmpty()){
                 break ;
            }
            else {
                System.out.println("学号不存在，重新输入！");
            }
        }
        return stunum;
    }


    // 校验判断是否输入正确科目：
    public int courseCheck() {
        Loop:while (true) {
            System.out.print("输入科目名称：");
            String coursename = in.next();
            switch (coursename) {
                case "语文":
                    i = 1;
                    break Loop;
                case "数学":
                    i = 2;
                    break Loop;
                case "英语":
                    i = 3;
                    break Loop;
                default:
                    System.out.println("请输入正确科目！");
                    break;
            }
        }
        return i;
    }
    //分数校验
    public int scoreCheck(){
        while (true){
            System.out.print("输入分数：");
            i = in.nextInt();
            if(i<=100&&i>=0){
                break ;
            }
            else {
                System.out.println("请输入正确分数！");
            }
        }
        return i;
    }

}
