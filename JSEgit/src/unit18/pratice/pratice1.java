package unit18.pratice;

public class pratice1 extends Thread{ //继承Thread

    public void run() { //重写run方法
        for (int i=1;i<=5;i++){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("aaa");
        }
    }

    public static void main(String[] args) {
        pratice1 p=new pratice1();
        p.start();
    }
}
