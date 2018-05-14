package unit19.pratice;

import java.net.*;

public class pratice1 {
    public static void main(String[] args) {
        InetAddress ip; // 创建InetAddress对象
        try { // try语句块捕捉可能出现的异常
            ip = InetAddress.getByName("PC201503172300"); // 修改为指定的主机名称
            String hostname=ip.getHostName();//获得主机名
            String hostip = ip.getHostAddress(); // 获取主机IP地址
            String localip=ip.getLocalHost().getHostAddress();//本机地址
            System.out.println("主机名：" + hostname);// 将本机名输出
            System.out.println("主机IP地址：" + hostip);
            System.out.println("本机IP地址："+localip);
        } catch (UnknownHostException e) {
            e.printStackTrace(); // 输出异常信息
        }
    }


}
