package unit15.pratice;
import java.io.*;
import javax.swing.*;

public class pratice1 {
    public static void main(String[] args) {
        byte b[] = new byte[2];
        File file=new File("F:/Interllij IDEA/workpace/trunk/javase/src/unit15/sl/FileReaderword.text");

        {
            try {
                FileInputStream fis = new FileInputStream(file);
                ProgressMonitorInputStream in = new ProgressMonitorInputStream(null, "读取文件", fis);
                while (in.read(b) != -1) {
                    String s = new String(b);
                    System.out.print(s);
                    Thread.sleep(100);
                }
            } catch(Exception e){
                e.printStackTrace();
            }

        }
    }


}
