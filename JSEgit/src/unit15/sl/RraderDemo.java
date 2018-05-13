package unit15.sl;

import java.io.*;

public class RraderDemo {
    public static void main(String[] args) {
        //在指定位置创建文件
        File file=new File("F:/Interllij IDEA/workpace/trunk/javase/src/unit15/sl/FileReaderword.text");
        try {
            //通过文件对象创建文件输出字符流对象
            FileWriter fw=new FileWriter(file);
            //将文件输出字符流包装成缓冲流
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("您好！");
            bw.write("我叫朱文睿。");
            bw.newLine();//换行处理
            bw.write("请多指教");
            //关闭流
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            //通过文件创建文件写入流对象
            FileReader fr=new FileReader(file);
           //将文件读取流包装成缓冲读取流
            BufferedReader br=new BufferedReader(fr);
            String str;
            int i=1;
            //readLine逐行读取文件内容
            while ((str=br.readLine())!=null){
                System.out.println("第"+i+"行："+str);
                i++;
            }
            //关闭流：
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
