package unit18.sl;

public class SynchronizedTest implements Runnable{
    private int num=5;
    public void run() {
        while (true){
            synchronized (this){ //同步代码快
                if(num>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("剩余票数："+num--);
                }
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedTest s=new SynchronizedTest();//实例化对象
        Thread t1=new Thread(s); //以该类对象分别实例话3个线程
        Thread t2=new Thread(s);
        Thread t3=new Thread(s);
        t1.start();//分别启动线程
        t2.start();
        t3.start();
    }
}
