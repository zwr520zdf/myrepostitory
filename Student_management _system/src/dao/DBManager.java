package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
    private static final String driver = "com.mysql.jdbc.Driver";// 数据库连接的驱动类的路径
    private static final String url = "jdbc:mysql://localhost:3306/test";// 连接数据库的url地址
    private static final String userName = "sa";// 连接数据库的用户名
    private static final String pwd = "170130";// 连接数据库的密码
    /**
     * 获取数据库连接对象
     */
    public static Connection getConnection(){
        Connection conn=null;
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url, userName, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;

    }
    /**
     * 对数据的增删改
     */
    public static boolean executeUpdate(String sql,Object[] obj){
        boolean result=false;
        Connection conn=getConnection();
        PreparedStatement stm=null;
        try {
            stm=conn.prepareStatement(sql);
            for (int i=0;obj!=null && i<obj.length;i++) {
                stm.setObject(i+1, obj[i]);
            }
            int num=stm.executeUpdate();
            if(num>0){
                result=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            closeAll(conn,null,stm);
        }
        return result;


    }
    /**
     * 关闭数据库连接对象
     * @param conn
     * @param rs
     * @param stm
     */
    public static void closeAll(Connection conn,ResultSet rs,Statement stm){
        try {
            if (rs != null){
                rs.close();
            }
            if (stm != null){
                stm.close();
            }
            if (conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

