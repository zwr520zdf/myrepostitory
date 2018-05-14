package unit18.sl;

public class SleepTest implements Runnable {
    public void run() {
        for(int i=1;i<=3;i++){
            try{                       //每隔5秒休眠一次
                System.out.println("休眠");
                Thread.sleep(5000);
                System.out.println("开始");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepTest s = new SleepTest();
        new Thread(s).start();
    }

}
