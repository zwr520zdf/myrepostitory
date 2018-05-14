package unit18.sl;

public class RunnableTest implements Runnable{ //实现Runnable接口
    private String  name; //定义变量
    public void run() { //重写run方法
        for(int i=1;i<=5;i++){
            System.out.println(name+"运行,i="+i);
        }
    }
    public static void main(String[] args) {
        RunnableTest r1 = new RunnableTest();
        RunnableTest r2 = new RunnableTest();
        new Thread(r1).start();
        new Thread(r1).start();
        new Thread(r2).start();  //启动线程
    }

}

