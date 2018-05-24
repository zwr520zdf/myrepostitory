package unit20.sl;

import java.sql.*; //导入sql包

public class Conn {
    private static final String driver = "com.mysql.jdbc.Driver";// 数据库连接的驱动类的路径
    private static final String url = "jdbc:mysql://localhost:3306/aaa";// 连接数据库的url地址
    private static final String userName = "sa";// 连接数据库的用户名
    private static final String pwd = "170130";// 连接数据库的密码
    Connection con; //声明Connetion对象
    public Connection getConnection() { //建立返回值为Connection的方法
        try {
            Class.forName(driver); //加载数据库驱动类
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            //通过访问数据库的URL获取数据库连接对象
            con=DriverManager.getConnection(url, userName, pwd);
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;//按方法要求返回一个Connection对象
    }

    public static void main(String[] args) {
        Conn c=new Conn(); //实例化对象
        c.getConnection();
    }

}
