package unit17.pratice;

import java.io.*;
import java.util.Scanner;

public class creatword {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入文件夹名：");
        String name=in.nextLine();   //控制台输入文件名
        System.out.println("输入文件内容：");
        String word=in.nextLine();  //控制台输入整行数据内容
        File file=new File("F:/Interllij IDEA/workpace/trunk/javase/src/unit17/pratice/"+name+".txt");
        try {
            //通过文件对象创建文件输出字符流对象
            FileWriter fw = new FileWriter(file);
            //将文件输出字符流包装成缓冲流
            BufferedWriter bw=new BufferedWriter(fw);
            //将输入的内容写入文件
            bw.write(word);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            //通过文件创建文件写入流对象
            FileReader fr = new FileReader(file);
            //将文件读取流包装成缓冲读取流
            BufferedReader br=new BufferedReader(fr);
            String str; //存入读取的每一行内容
            int i=1;
            //readLine逐行读取文件内容
            System.out.println("读取的内容如下：");
            while ((str=br.readLine())!=null){
                System.out.println(str);
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
