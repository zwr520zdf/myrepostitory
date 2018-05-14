package unit18.sl;

public class YieldTest implements Runnable{
        private String name;
        public void run(){
            for(int i=1;i<=5;i++){
                //获取线程的名称
                System.out.println(Thread.currentThread().getName()+"运行,i="+i);

                if(i==2){
                    Thread.currentThread().yield();//礼让
                }
            }
        }
        public static void main(String[] args) {
            new Thread(new YieldTest()).start(); 
            new Thread(new YieldTest()).start();
            new Thread(new YieldTest()).start();
        }


}
