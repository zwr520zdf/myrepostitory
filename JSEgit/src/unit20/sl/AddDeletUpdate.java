package unit20.sl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddDeletUpdate {
    public static void main(String[] args) {
        Connection con=null;  //声明对象
        PreparedStatement pst;
        ResultSet rst=null;
        String sql=null;
        Conn c=new Conn();
        con=c.getConnection();//建立数据库连接
        System.out.println("=============增加操作=============");
        sql="insert into users values(default,?,?,?,null,null,null,null,default)"; //自增长id直接设置为Null
       try {
            con.setAutoCommit(false);//取消自动提交事务
            pst=con.prepareStatement(sql);
            pst.setString(1,"abc");
            pst.setInt(2,321);
            pst.setString(3,"abctest");
            if (!pst.execute()){
                con.commit();//成功后提交事务
                System.out.println("添加成功");
            }

        } catch (SQLException e) {
            try {
                con.rollback(); //失败后事务回滚
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        System.out.println("=============更新操作=============");
        sql="update admin set adminPwd=? where adminName=?";
        try {
            pst=con.prepareStatement(sql);
            pst.setInt(1,333);
            pst.setString(2,"aaa");
            System.out.println(!pst.execute());  //false表示成功
                System.out.println("更新成功");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("=============删除操作=============");
        sql="delete from users where username=?";
        try {
            con.setAutoCommit(false);
            pst=con.prepareStatement(sql);
            pst.setString(1,"abc");
            if (!pst.execute()){
                con.commit();
                System.out.println("删除成功");
            }
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }

    }
}
