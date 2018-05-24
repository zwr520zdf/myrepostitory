package dao;

import entity.student;
import entity.stuscore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
    String sql;
    Connection con=null;  //声明对象
    PreparedStatement pst=null;
    ResultSet rst=null;
    Scanner in=new Scanner(System.in);

    //添加学生信息方法
    public boolean AddStudent() {
        boolean flag=false;
        Integer num=0;//记录插入数据次数
        String sql="insert into student values(default,?,?,?)";
        //插入信息
        student st=new student();
        check c=new check();
        System.out.print("姓名:");
        st.setStuname(in.next());
        Loop:while (true){
            System.out.print("学号:");
            StudentDao sd=new StudentDao();
            String s=in.next();
            List<stuscore> list = sd.getscore(s);
            if(!list.isEmpty()){
                System.out.println("学号存在，请重新输入！");
            }
            else {
                st.setStunum(s);
                break Loop;
            }

        }
        System.out.print("年龄:");
        st.setAge(in.nextInt());
        Object[] obj={st.getStuname(),st.getStunum(),st.getAge()};
        flag=DBManager.executeUpdate(sql, obj);
        //插入成绩
        for (int i=1;i<=3;i++){
            stuscore ss=new stuscore();
            if(i==1){
                System.out.print("语文:");
            }
            else if(i==2){
                System.out.print("数学:");
            }
            else if(i==3){
                System.out.print("英语:");
            }
            ss.setScore(in.nextInt());
            sql="insert into stuscore(stunum,cid,score) values(?,?,?)";
            Object[] obj1={st.getStunum(),i,ss.getScore()};
            boolean flage1=DBManager.executeUpdate(sql, obj1);
            if(flage1){
                num++;
            }
        }
        if(flag&&num==3){  //判断是否信息插入完全
            return true;
        }
        else {
            return false;
        }
    }

    //删除学生
    public boolean delete(String num){
        boolean flag=false;
        String sql="delete from student where stunum=?";
        Object[] obj={num};
        flag=DBManager.executeUpdate(sql, obj);
        return flag;
    }
    //更新学生信息
    public boolean updatestu(String num){
        boolean flag=false;
        String sql="update student set stuname=?,age=? where stunum=?";
        //更新的信息
        student _stu=new student();
        System.out.print("姓名:");
        _stu.setStuname(in.next());
        System.out.print("年龄:");
        _stu.setAge(in.nextInt());
        Object[] obj={_stu.getStuname(),_stu.getAge(),num};
        flag=DBManager.executeUpdate(sql, obj);
        return flag;
    }

    //更新科目成绩
    public boolean updatescore(String num){
        boolean flag=false;
        String sql="update stuscore set score=? where stunum=? and cid=?";
        check c=new check();//创建校验对象
        System.out.println("输入修改分数：");
        Integer x=in.nextInt();
        Object[] obj={x,num,c.courseCheck()};  //科目校验
        flag=DBManager.executeUpdate(sql, obj);
        return flag;
    }

    //查询所有成绩
    public List<student> getallscore(){
        List<student> list=new ArrayList<>();
    con = DBManager.getConnection();
    sql = "select s.stuname,s.stunum,s.age,SUM(ss.score)from student s,stuscore as ss,course as c where s.stunum=ss.stunum and ss.cid=c.cid GROUP BY s.stunum ORDER BY SUM(ss.score)";
            try {
        pst = con.prepareStatement(sql);
        rst = pst.executeQuery();
        while (rst.next()) {
            student stu1 = new student();
            //数据库数据存入对象
            stu1.setStuname(rst.getString("stuname"));
            stu1.setStunum(rst.getString("stunum"));
            stu1.setAge(rst.getInt("age"));
            list.add(stu1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        DBManager.closeAll(con, rst, pst);
    }
            return list;
}
        //查询学生信息
        public student getall(String num){
            student stu1 = new student();
            con = DBManager.getConnection();
            sql = "select s.stuname,s.stunum,s.age from student s,stuscore as ss,course as c where s.stunum=ss.stunum and ss.cid=c.cid and s.stunum=?";
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, num);
                rst = pst.executeQuery();
                while (rst.next()) {
                    //数据库数据存入对象
                    stu1.setStuname(rst.getString("stuname"));
                    stu1.setStunum(rst.getString("stunum"));
                    stu1.setAge(rst.getInt("age"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBManager.closeAll(con, rst, pst);
            }
            return stu1;
        }

    //查询学生分数
    public List<stuscore> getscore(String num){
        List<stuscore> list=new ArrayList<>();
        con = DBManager.getConnection();
        sql = "select c.cname,ss.score from student s,stuscore as ss,course as c where s.stunum=ss.stunum and ss.cid=c.cid and s.stunum=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, num);
            rst = pst.executeQuery();
            while (rst.next()) {
                stuscore s=new stuscore();
                //数据库数据存入对象
                s.setScore(rst.getInt(2));
                list.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(con, rst, pst);
        }
        return list;
    }

    //分数段学生查询
    public List<student> findByscore(){
        List<student> list=new ArrayList<>();
        con = DBManager.getConnection();
        sql = "select s.stuname,s.stunum from student s,stuscore as ss,course as c where s.stunum=ss.stunum and ss.cid=c.cid and ss.score>? and c.cid=?";
        try {
            check c=new check();//创建校验对象
            pst = con.prepareStatement(sql);
            pst.setInt(2, c.courseCheck());
            pst.setInt(1,c.scoreCheck());
            rst = pst.executeQuery();
            while (rst.next()) {
                student s=new student();
                //数据库数据存入对象
                s.setStuname(rst.getString(1));
                s.setStunum(rst.getString(2));
                list.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(con, rst, pst);
        }
        return list;
    }

    //查询学生科目平均分
    public Double findAvgscore(){
        con = DBManager.getConnection();
        Double avg=0.0;//平均分
        sql = "select AVG(ss.score) from student s,stuscore as ss,course as c where s.stunum=ss.stunum and ss.cid=c.cid and s.stunum=?";
        try {
            check c=new check();//创建校验对象
            pst = con.prepareStatement(sql);
            pst.setString(1,c.stunumCheck());
            rst = pst.executeQuery();
            while (rst.next()) {
                avg=rst.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(con, rst, pst);
        }
        return avg;
    }

    //查询学校科目平均分
    public List<Double> findallAvgscore(){
        con = DBManager.getConnection();
        sql = "select c.cname,AVG(ss.score) from student s,stuscore as ss,course as c where s.stunum=ss.stunum and ss.cid=c.cid GROUP BY c.cname";
        List<Double> list=new ArrayList<>();
        try {
            pst = con.prepareStatement(sql);
            rst = pst.executeQuery();
            while (rst.next()) {
                list.add(rst.getDouble(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(con, rst, pst);
        }
        return list;
    }

}
