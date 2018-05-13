package unit15.sl;
import java.io.*;

public class File_Input_Output {
    public static void main(String[] args) {
        File file=new File("F:/Interllij IDEA/workpace/trunk/javase/src/unit15/sl/outword.text");
        //利用File对象创建FileOutputStream对象
        try {
            //扑捉异常
            FileOutputStream out=new FileOutputStream(file);
            //创建btye型数组
            byte buy[]="今天天气真好，阳光明媚".getBytes();
            out.write(buy);  //将信息写入文件中
            out.close(); //关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }

        //读取数据：创建FileInputStream类对象

        try {
            FileInputStream in=new FileInputStream(file);
            byte byt[]=new byte[(int) file.length()];//根据文件长度创建字节数组
            in.read(byt);//读取的数据放入字节数组中
            String str=new String(byt);//利用字节数组创建字符串
            //将文件中的信息输出
            System.out.println(str);
            in.close();//关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
