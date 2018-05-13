package unit15.pratice;

import java.io.*;

public class pratice2 {
    public static void main(String[] args) {
        char a[] = "今天是周五".toCharArray();
        int n = 0;
        try {
            File file = new File("F:/Interllij IDEA/workpace/trunk/javase/src/unit15/sl/password.text");
            for (int i = 0; i < a.length; i++) {
                a[i] = (char) (a[i] ^ 't');  //按位异或字符t
            }
            FileWriter fw = new FileWriter(file); //创建写入对象
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(a, 0, a.length);  //写入数据
            bw.close();
            fw.close();
            FileReader fr = new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            char tom[] = new char[10];  //存储读取的数据
            System.out.println("加密后：");
            while ((n = br.read(tom, 0, 10)) != -1) {
                String s = new String(tom, 0, n);
                System.out.println(s);
            }
            fr.close();
            br.close();
            fr = new FileReader(file);
            br=new BufferedReader(fr);
            System.out.println("明文：");
            while ((n = br.read(tom, 0, 10)) != -1) {
                for (int j = 0; j < n; j++) {
                    tom[j] = (char) (tom[j] ^ 't'); //再异或一遍得到原文
                }
                String str = new String(tom, 0, n);
                System.out.println(str);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
