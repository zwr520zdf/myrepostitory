package unit18.pratice;

public class deletone implements Runnable{
    private Integer num=15;
    public void run() { //实现接口重写run方法
        for (int i=15;i>=1;i--){
            add();
        }
    }
    public synchronized void add(){
        if (num>=1){       //实现15减到1
            try {
                Thread.sleep(2000);//休眠2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程减："+num--);
        }

    }
}
