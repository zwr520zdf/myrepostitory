package unit18.sl;

public class ThreadTest extends Thread{ //继承Thread类
    private  int num=20; //声明变量
    public void run(){
        //重写run方法
        while (true){
            System.out.print(num+" ");//打印数字num
            num--;
            if (num==0){
                System.out.println();
                break;//当等于0时候退出循环
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest t1=new ThreadTest();//实例化对象
        ThreadTest t2=new ThreadTest();
        t1.start();//开始线程
        //t1.start();继承Thread类受单继承影响，不适合多个线程共享资源
        t2.start();
    }
}
