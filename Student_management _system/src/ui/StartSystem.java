package ui;

import dao.StudentDao;
import dao.check;
import entity.student;
import entity.stuscore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartSystem {
    public static void main(String[] args) {
        System.out.println("******欢迎登陆学生系统******");
        StudentDao sd=new StudentDao();//new一个StutdentDao对象
        Scanner in=new Scanner(System.in);//控制台输入实例化
        //系统界面
        check c=new check();
        while(true){
            System.out.println();
            System.out.println("****************************");
            System.out.println("*      1.添加学生          *");
            System.out.println("*      2.删除学生          *");
            System.out.println("*      3.更新学生          *");
            System.out.println("*      4.查询学生信息      *");
            System.out.println("*      5.高于某分数学生    *");
            System.out.println("*      6.查询学生平均分    *");
            System.out.println("*      7.查询科目平均分    *");
            System.out.println("*      8.查询所有学生成绩  *");
            System.out.println("*      0.退出系统          *");
            System.out.println("****************************");

            int op=in.nextInt();//输入数字
            switch (op){
                case 1:
                    System.out.println("****************************");
                    if(sd.AddStudent()){
                        System.out.println("结果：添加成功");
                    }else {
                        System.out.println("结果：添加成功");
                    }
                    break;
                case 2:
                    System.out.println("****************************");
                    if(sd.delete(c.stunumCheck())){
                        System.out.println("结果：删除成功");
                    }else {
                        System.out.println("结果：删除失败");
                    }
                    break;
                case 3:
                    System.out.println("****************************");
                    System.out.println("*      1.更新学生信息       *");
                    System.out.println("*      2.更新科目分数       *");
                    System.out.println("****************************");
                    System.out.println("输入选项：");
                    switch (in.nextInt()){
                        case 1:
                            System.out.println("****************************");
                            if (sd.updatestu(c.stunumCheck())){
                                System.out.println("结果：更新成功");
                            }else {
                                System.out.println("结果：更新失败");
                            }
                            break;
                        case 2:
                            System.out.println("****************************");
                            if (sd.updatescore(c.stunumCheck())){
                                System.out.println("结果：更新成功");
                            }else {
                                System.out.println("结果：更新失败");
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("****************************");
                    String a=c.stunumCheck();
                    student stu=sd.getall(a);
                    System.out.println("姓名，学号，年龄，语文，数学，英语");
                    List<stuscore> list=sd.getscore(a);
                    System.out.print(stu.getStuname()+"，"+stu.getStunum()+"，"+stu.getAge());
                    for (stuscore s:list
                         ) {
                        System.out.print("，"+s.getScore());
                    }
                    break;
                case 5:
                    System.out.println("****************************");
                    List<student> list1=sd.findByscore();
                    if(list1.isEmpty()){
                        System.out.println("此分数段没有人");
                    }
                    else {
                    System.out.println("姓名，学号");
                    for (student s:list1
                            ) {
                        System.out.println(s.getStuname()+"，"+s.getStunum());
                    }
                    }
                    break;
                case 6:
                    System.out.println("****************************");
                    System.out.println("学生平均分："+sd.findAvgscore());
                    break;
                case 7:
                    System.out.println("****************************");
                    System.out.println("语文，数学，英语");
                    for (Double y:sd.findallAvgscore()
                            ) {
                        System.out.print(y+"，");
                    }
                    break;
                case 8:
                    System.out.println("****************************");
                    System.out.println("姓名，学号，年龄，语文，数学，英语");
                    for (student s:sd.getallscore()
                            ) {
                        System.out.print(s.getStuname()+"，"+s.getStunum()+"，"+s.getAge());
                        for (stuscore s_:sd.getscore(s.getStunum())){
                            System.out.print("，"+s_.getScore());
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("*********欢迎下次光临*******");
                    System.exit(0);
                default:
                    System.out.println("****************************");
                    System.out.println("请输入正确数字");
                    break;
            }
        }
    }
}
