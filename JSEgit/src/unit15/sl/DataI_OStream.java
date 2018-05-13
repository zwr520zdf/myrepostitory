package unit15.sl;

import java.io.*;

public class DataI_OStream {
    public static void main(String[] args) {
        File file=new File("F:/Interllij IDEA/workpace/trunk/javase/src/unit15/sl/dataword.text");
        try {
            FileOutputStream fos=new FileOutputStream(file);
            //用File文件对象创建DataOutPutStream对象
            DataOutputStream ds=new DataOutputStream(fos);
           ds.writeUTF("使用UTF方法");//写入磁盘文件数据
            ds.writeBytes("使用Bytes方法写入");
            ds.close();
            fos.close();
            FileInputStream fis=new FileInputStream(file);
            DataInputStream dis=new DataInputStream(fis);
            //将文件数据输出
            System.out.println(dis.readUTF()); //writeBytes写入的不容易读取
            fis.close();
            dis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
