package unit20.pratice;

import unit20.sl.Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SearchEmp {
    public static void main(String[] args) {
        Connection con=null;//声明对象
        PreparedStatement pst=null;
        ResultSet rst=null;
        String sql=null;
        Conn c=new Conn();
        con=c.getConnection();//数据库连接
        System.out.println("====查询所有成员===");
        try {
            sql="select * from user";
            pst=con.prepareStatement(sql);  //查询数据库
            rst=pst.executeQuery(); //返回结果集
            while(rst.next())//判断当前是否为最后一条记录
            {
                System.out.println("姓名："+rst.getString("username")+" 密码"+rst.getString("userpwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("====添加成员===");
        sql="insert into user values(default,?,?,?,?)";

        try {
            con.setAutoCommit(false);//取消自动提交事务
            pst=con.prepareStatement(sql); //预处理sql
            pst.setString(1,"李某");//设置参数
            pst.setInt(2,6666);
            pst.setString(3,"女");
            Date date=new Date();
            Scanner in=new Scanner(System.in);
            System.out.println("输入：");
            String s=in.nextLine();

            pst.setString(4, s);
            if (!pst.execute()){//执行sql返回结果
                con.commit();
                System.out.println("添加成功");
            }

        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        /*System.out.println("====删除成员===");
        sql="delete from user where date=?";
        try {
            pst=con.prepareStatement(sql);
            pst.setString(1,"1999-10-20");
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}
