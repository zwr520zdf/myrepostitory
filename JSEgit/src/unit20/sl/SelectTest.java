package unit20.sl;

import java.sql.*;

public class SelectTest {
    public static void main(String[] args) {
        Connection con=null;//初始化
        Statement st=null;
        ResultSet rst=null;
        Conn c=new Conn(); //调用对象
        con=c.getConnection();//建立数据库连接
        String sql="select * from users";//查询表
        try {
            st=con.createStatement(); //创建一个Statement对象
            rst=st.executeQuery(sql);
            while (rst.next()){ //判断当前语句是否为最后一句
                System.out.println("编号："+rst.getInt("userId")+"姓名："+rst.getString("username"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("===========模糊查询=============");
        sql="select * from users where username like '%o%'";
        try {
            rst=st.executeQuery(sql);
            while (rst.next()){
                System.out.println("编号："+rst.getInt("userId")+"姓名："+rst.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("===========预处理语句=============");
        PreparedStatement pst=null;  //声明预处理对象
        sql="select * from users where userId>?";
        try {
            pst=con.prepareStatement(sql); //实例化预处理对象
            pst.setInt(1,3);//设置参数
            rst=pst.executeQuery();//执行预处理语句
            System.out.println(pst.execute());
            while (rst.next()){
            System.out.println("编号："+rst.getInt("userId")+"姓名："+rst.getString("username"));
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("=============更新操作=============");
        sql="update admin set adminPwd=? where adminName=?";
        try {
            pst=con.prepareStatement(sql);
            pst.setInt(1,111);
            pst.setString(2,"aaa");
            System.out.println(pst.execute());
            if(pst.execute()){
                System.out.println("更新成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
