package unit18.sl;

public class SynchronizedTest2 implements Runnable{
    private Integer sum=10;
    public void run() {
        while (true){
            Ticket();  //在run方法中调用该同步方法
        }

    }
    public synchronized void Ticket(){
        if (sum>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("剩余票数:"+sum--);
        }
    }

    public static void main(String[] args) {
        SynchronizedTest2 s=new SynchronizedTest2();//实例化对象
        Thread t1=new Thread(s); //以该类对象分别实例化4个线程
        Thread t2=new Thread(s);
        Thread t3=new Thread(s);
        Thread t4=new Thread(s);
        t1.start();//分别启动线程
        t2.start();
        t3.start();
        t4.start();
    }
}
