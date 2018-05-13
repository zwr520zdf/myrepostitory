package unit15.sl;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        //指定路径下创建文件
        File file=new File("F:/Interllij IDEA/workpace/trunk/javase/src/unit15/sl/word.text");
        if ((file.exists())){
            file.delete();//判断文件是否存在，存在就删除
            System.out.println("文件删除");
        }else {
            try {  //try-catch扑捉文件的异常
                file.createNewFile();
                System.out.println("文件已经建立");
            } catch (IOException e) {
                e.printStackTrace();
            }
            //创建指定位置的文件
            File file1=new File("F:/Interllij IDEA/workpace/trunk/javase/src/unit15/sl/word.text");
            if(file1.exists()){//判断文件是否存在
                String name=file1.getName();//获取文件名字
                System.out.println(name);
                long length=file1.length();//获取文件长度
                System.out.println(length);
                String path=file1.getAbsolutePath();//获取文件的绝对路径
                System.out.println(path);
            }
        }
    }
}
