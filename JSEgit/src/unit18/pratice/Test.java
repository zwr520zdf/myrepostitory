package unit18.pratice;

public class Test {
    public static void main(String[] args) {
        addone a=new addone();//实例化加对象
        deletone d=new deletone();//实例化减对象
        //实例化2个加线程
        Thread t1_add=new Thread(a);
        Thread t2_add=new Thread(a);
        //实例化2个减线程
        Thread t1_del=new Thread(d);
        Thread t2_del=new Thread(d);
        //启动加线程
        t1_add.start();
        t2_add.start();
        //启动减线程
        t1_del.start();
        t2_del.start();
    }
}
