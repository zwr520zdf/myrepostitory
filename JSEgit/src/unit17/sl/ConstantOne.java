package unit17.sl;

public class ConstantOne {
    enum  constant{
        //常量放入枚举类型中
        A,B
    }

    public static void main(String[] args) {
        for (constant s:constant.values()
             ) {
            //枚举变量打印出来
            System.out.println(s);
        }
        //valuesOf()将普通字符串转为枚举类型
        //相同则为0，1代表方法中参数在调用该方法的枚举对象位置之前
        System.out.println(constant.valueOf("B").compareTo(constant.A));
        //ordinal()获取某个枚举对象的索引值
        System.out.println(constant.valueOf("A").ordinal());
    }
}
