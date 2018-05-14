package unit18.pratice;

public class addone implements Runnable{
    private Integer num=1;
    public void run() { //实现接口重写run方法
      for (int i=1;i<=5;i++){
           add();
       }
    }
    public synchronized void add(){
        if (num<=5){       //实现从1增加到5
            try {
                Thread.sleep(1000);//休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程加："+num++);
        }

    }
}
