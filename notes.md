# 第一章：初始java

1. 语言特性：
* 简单
* 面向对象
* 分布性
* 可移植性
* 解释性
* 安全性
* 健壮性
* 多线程： 多线程机制能够使应用程序在同一时间并行执行多项任务，而且相应的同步机制可以保证不同线程能够正确地共享数据。使用多线程，可以带来更好的交互能力和实时行为。
* 高性能
* 动态

## 第1章总结：

了解java语言的特性，掌握在windows操作系统下搭建java环境。

2.编译环境:

* JDK: java开发工具包，是程序员使用java语言编写java程序所需的开发工具包，是提供给程序员使用的。JDK包含了JRE，同时还包含了编译java源码的编译器javac，还包含了很多java程序调试和分析的工具。
* JRE: java运行时环境，包含了java虚拟机，java基础类库。是使用java语言编写的程序运行所需要的软件环境，是提供给想运行java程序的用户使用的
* 如果你需要运行java程序，只需安装JRE就可以了。如果你需要编写java程序，需要安装JDK。

***

## 第三章：java语言基础

1. 包声明：package为包的关键字

2. 声明成员变量和局部变量：类的属性称之为类的全局变量（成员变量），将方法中的属性称之为局部变量。全局变量声明在类体中，局部变量声明在方法体中。

3. 基本数据类型
    * 整型：byte、short、int、long
    * 浮点型：double、float
    * 字符型：char
    * 布尔型：boolean

4. 标识符：由任意顺序的字母、下划线、美元符号、数字组成，第一个字符不能是数字。

5. 变量的有效范围:成员变量和局部变量
    * 成员变量：在整个类中都有效
        * 静态变量：静态变量的有效范围可以跨类，直接以"类名.静态变量"的方式在其他类中使用。
    * 局部变量：只在当前的方法中有效。当局部变量和成员变量同名，成员变量在此方法中暂时失效。

6. 移位操作
    * &：按位与
    * |：按位或
    * ~：按位取反
    * ^：按位异或
    * <<:左移，右边补入0
    * >>:右移动：最高位是1补入1，最高位0补入0
    * >>>:无符号右移：都补入0

7. 数据类型转换：小类型到大类型自动转换，大类型到小类型需要强转。

### 第3章小结：

* 了解Java的特殊字符
* 熟练掌握Java的8种数据类型
* 熟练使用Java变量
* 理解类型转换
* 熟练掌握运算符的优先级

***

## 第四章：流程控制

1. 条件语句
    * if判断后面只有一条语句，可以省略{}

2. switch多分支语句
    * switch语句中表达式的值必须是整形、字符型或字符串型（jdk1.7以后）
    * 当遇到break则不往下执行

3. while循环
    * while(x==5);在while表达式后面加上";"

4. do-while循环
    * 程序至少执行一次

![do-while](https://i.loli.net/2018/05/14/5af90b1f96efe.png)

5.for循环

* foreach语句:变量x不必进行初始化

``` 代码
    for(变量x:遍历对象obj){
      引用了x的java语句
     }

```

6.break:提前结束循环体

* 利用标签名跳出指定的循环体

``` 代码
    标签名：循环体{
        break 标签名；
    }
```

```计算器
        Scanner in=new Scanner(System.in);
        System.out.print("输入乘法表：");
        int num=in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }

```

### 第4章小结：

* if-else条件分支语句
* switch-case开关语句
* 循环结构语法及使用场合
* break和continue语句的区别
* 嵌套循环

***

## 第五章：字符串

* String：指定该变量为字符串类型
* String类的length()方法可获取声明的字符串对象的长度。
* indexOf()返回搜索的字符或字符串首次出现的位置，lastIndexOf()返回搜索的字符或字符串最后一次出现的位置
* equals()方法比较字符是否具有相同的字符和长度，equalsIgnoreCase忽略大小写
* str.format()格式化字符串
* StringBuffer是可变的字符串，StringBuffer的默认容量大小是16个字符
* StringBuffer转换为String使用toString
* append()追加内容，insert()

```字符串基本操作
 String str=new String("hello");
        System.out.println(str);
        System.out.println(str.lastIndexOf(""));/*当lastIndexOf("")为空返回字符串长度*/
        System.out.println(str.charAt(1)); //下标从1开始
        System.out.println(str.length());
        System.out.println(str.indexOf("o"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(2,3));//从固定位置开始截取
```

### 第5章小结：

学习常规的字符串创建，连接的方式，以及获取字符串信息等操作，在字符串高级应用方面：格式化字符串、使用正则表达式。

***

## 第六章：数组

* 声明的同时为一维数组分配内存空间（整形数组中各个元素的初始值都为0）

``` 一维数组
int arr[]=new int[12];
String a[]=new String[3];
```

* 二维数组声明

``` 二维数组声明代码
int arr[][]=new int[1][2];
```

* 数组排序：Arrays.sort(obj)对数组的升序
* 冒泡法

```冒泡法
System.out.println("---冒泡排序----");
        for(int i=0;i<y.length;i++){
            for(int j=0;j<y.length-1;j++){
                if(y[j]>y[j+1]){
                    int temp=y[j];
                    y[j]=y[j+1];
                    y[j+1]=temp;
                }
            }
        }
```

* 选择排序法

### 第6章小结：

* 一维数组的声明和定义
* 一维数组的应用
* 二维数组的声明和定义
* 二维数组的应用
* 数组排序方法，以及关键冒泡法排序

***

## 第七章：类和对象

* 对象：事物存在的实体，其中包括两个部分，静态部分不能被动，动态部分具备的行为。
* 类：具有相同属性和一类实体的统称。
  1. 成员方法：成员方法的返回值的类型要与方法返回值类型一致
  2. private本类可使用，子类、本包或其他包都不可用
     * public本类、子类、本包或其他包都可以使用
     * prptected本类、子类、本包可以用，其他包都不可用
     * java中类的权限设定会约束类成员的权限

* 面向程序设计具有的特点：封装性、继承性、多态性

    1. 封装：将对象的属性和行为封装起来，其载体就是类，对用户隐藏其中实现细节。
    2. 继承：子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为。
    3. 多态：是同一个行为具有多个不同表现形式或形态的能力。

* this关键字:代表本类对象的引用；this.成员变量，this.成员方法

* 构造方法：与类同名的方法，对象的创造通过构造方法完成，每当类实例化一个对象时，类都会自动调用构造方法。
* 在没有定义任何构造方法的时，编译器会默认创建一个无参的构造方法，如果创建了有参构造方法，则编译器不会创建无参构造方法，此时只有自己创建，否则用无参的构造方法实例化对象时候编译器会报错。

* 静态常量：使用static修饰，静态常量、变量、方法被成为静态成员，而静态成员为类所有，可以在本类或者其他类中使用："类名."的方式调用静态成员
* 静态成员在内存中被类所共享

``` 静态变量
 static int i=20;
.....
     demo1 d=new demo1();
        demo1 _d=new demo1();      //静态变量在内存中被类 所共享
        System.out.println(d.i);
        d.test();
        System.out.println(_d.i);
        最后输出 20 21 如果i不是静态输出20 20
```

* 在静态方法中不可以使用this关键字和super关键字
* 在静态方法中不可以直接调用非静态的方法
* 不能在方法体中的局部变量声明为静态
* 修饰代码块表示静态代码块 1.静态代码块属于类所有,在类加载的时候执行且只执行一次 2.非静态代码块属于对象所有,每一次创建对象都会执行一次
* 类的执行顺序: 1.静态属性 2.静态代码块 3.静态方法 4.非静态属性 5.非静态代码块 6.非静态方法 7.构造方法 注意静态的东西执行一次
* 静态方法不能被重写

* 对象的创建过程：实质上就是使用new操作调用构造方法创建对象
* 访问对象的属性和方法："对象.类成员"

### 第7章小结：

* 面向对象（OOP）的编程思想
* 类、对象
* 类和对象的关系
* 修饰符的范围
* 对象的操作
* 构造方法
* 构造方法的重载

***

## 第八章：包装类

1. Integer：Integer类在对象中包装了一个基本类型int的值。
    * 构造方法：
    ``` Integer构造方法
    Integer num=new Integer(12);
    Integer num=new Integer("12");
    ```
    * 常用方法：
        * inValue():以int型返回此Integer对象
        * toString():Integer转换成String
        * valueOf():String转成Integer
        * parseInt():String装成int

2. Boolean：Boolean类在对象中包装了一个基本类型boolean。

3. Character:Character类在对象中包装了一个基本类型为char值。一旦Charater类被创建，它包含的数值就不能被改变了

![包装类](https://i.loli.net/2018/05/14/5af90ba4deccf.png)

### 第8章小结：

* 掌握数字、字符、布尔值、的包装类
* Character类是字符的包装类，提供了对字符的各种处理方法
* 掌握各种包装类提供的方法

***

## 第九章：数字处理类

* Math类：提供众多的数学函数
* 正弦：Math.sin()，求平方：Math.pow(,)
* 返回大于等于参数的最小整数：Math.ceil()
* 返回小于等于参数的最大整数：Math.floor()
* Random类：java编译器以系统当前时间作为随机数生成器的种子
* BigInteger针对大整数的处理类和BigDecimal针对大小数的处理类。

### 第9章小结：

掌握任意随机数的生成，数字的格式化，以及大数字处理和基本的数学运算。

***

## 第十章：继承、接口和多态

1. 继承：子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为。
    * 在子类构造方法中可以用super()语句调用父类的成员和方法，但没有权限调用父类中被private修饰的方法
    * 重写：
        * 参数列表一致
        * 返回类型可以修改(必须是J2SE5.0以上)
        * 访问修饰符的限制一定要大于被重写方法的访问修饰符
    * 实例化子类对象的时候会在子类的构造方法中自动调用父类的无参构造方法，但如果父类没有无参构造方法只有有参的构造方法，则子类需要在自己的构造方法第一行利用super()手动调用父类的有参构造方法
    * 特点:
    * 1.不能继承私有的属性和方法,构造方法也不能继承
    * 2.一个类有且只有一个父类(继承的单一性)
    * 3.继承具有传递性
    * 4.父类类型可以指向子类对象,但是只能使用父类类型可以使用的方法和属性,但子类有和父类一样的属性和方法调用时由调用对象决定
    * 5.子类可以拥有跟父类一样的方法,具体调用哪个方法由对象的实际类型决定;
    * 6.子类类型到父类类型可以自动类型转换,父类类型到子类类型需要强制类型转换(父类类型实际上是一个子类对象才可以)
    * 7.区分父类对象和子类对象使用的关键字:this本类 super父类

2. 在使用 super和this时我们需要注意以下4个方面：
   * 每个子类构造方法中首先会隐含地调用super(),然后执行构造方法中的代码
   * super()和this()均需放在构造方法内第一行
   * this和super不能同时出现在一个构造函数中
   * this()和super()均不可以在static环境中使用。包括static方法、static语句块

3. Objcet类：java.lang.Object类是所有类的父类
    * Object类中的getClass()、notify()、notifyAll()、wait()等方法不能被重写，因为这些方法被定义为final类型

4. 重载：方法名字相同,参数类型，参数个数，参数顺序不同
    * 在同一个类中
    * 方法名一样
    * 参数列表不一样
    * 跟返回值类型没有关系

5. 多态:一个对象的某种行为有多种实现方式
    * 多态实现的方式：重载和重写

6. 抽象类:使用关键字abstract修饰的类
    * 1.抽象类不能实例化
    * 2.抽象类可以有构造方法
    * 3.可以有非抽象类中用于的一切
    * 4.抽象类中可以有抽象方法(使用abstract修饰的方法，且没有方法的具体实现--即没有大括号分号结尾)
    * 5.存在抽象方法的类一定是抽象类
    * 6.子类继承抽象类必须要实现其抽象方法，除非子类本身也是抽象类（即子类必须重写抽象方法）
    * 7.抽象方法不能是static和final和private：这三个修饰的都不能被重写，抽象方法需要被重写
    * 8.final修饰的方法不能被重写

```抽象类
public abstract class abstractBook {
    //public abstract void sum();
    public abstractBook() {
    }
    public static void main(String[] args) {
     //   abstractBook ab=new abstractBook();
        // 不能实例化对象cannot be instantiated
    }
}
```

* 接口:使用interface关键字修饰的
  * 接口中定义方法必须定义为：public或abstract
  * 接口中定义的任何字段都是静态常量:public static final可以省略
  * 接口支持多继承
  * 接口不能实例化  接口没有构造方法
  * 实现接口使用implements关键字
  * 必须实现接口所有的方法（除非本身就是抽象类接口）
  * 静态方法不能被子类重写（覆盖），因此接口中不定声明静态方法
  * 实现多个接口用逗号隔开
  * 接口里面的方法用;结束

### 第10章总结：

* 多态的两种形式：重载与重写
* 方法重载方法名相同，参数列表不同
* 方法重写方法名、返回类型、参数列表相同，子类方法范围不能比父类小
* 抽象类是用来继承的，有抽象方法的类一定是抽象类，抽象类不一定有抽象方法
* 接口允许多继承，接口中的属性的修饰符默认是public、static、final，方法修饰符默认是public、abstract

***

## 第十一章：类的高级特性

1. java类包：完整的类名需要包名+类名
    * 使用import关键字导入包
    * 使用import导入静态成员

2. fina
    * final变量：
        * 修饰局部变量，修饰基本类型，基本类型的值不能发生改变
        * 修饰引用类型，引用类型的地址值不能改变，但是该对象堆内存的值是可以改变
        * 在声明的时候必须对其进行赋值
    * final方法：
        * 修饰的方法表示最终的方法不能被重写
    * final类
        * 修饰的类表示最终的类不能被继承
3. 内部类
    * 内部类可以随便使用外部类的成员方法和成员变量
    * 局部内部类：内部类不仅可以在类中进行定义，还可以在类的局部位置定义。

### 第11章小结：

掌握包、final关键字的用法和内部类，同时了解如何导包，定义final变量，final方法以及final类。

***

## 第十二章：异常处理

* 错误：异常产生后,不做任何处理，程序会被终止。

* 异常的捕捉：由try catch finally组成
  * try语句块: 可能发生异常的java语句
  * catch：在try后面，用来激发被捕捉的异常
  * finally：最后执行的部分，无论try语句块中的代码，如何退出，都将执行finally语句块

* 异常的分类：

![异常的分类](https://i.loli.net/2018/05/13/5af7b4188a72f.png)

* Error类通常用以描述Java运行系统中的内部错误以及资源耗尽的错误等，一般是指JVM错误
* Exception类被称为非致命性异常，可以通过捕获处理后正常运行 ，可以分为两种：RuntimeException异常和Runtime Exception之外的异常
* RuntimeException异常又被称为运行时异常，即程序在运行阶段出现的异常；RuntimeException之外的异常又被称为编译时异常，即程序在编译阶段出现的异常。

``` 常见异常：
public class Demo {
    private String name;
    private int age;
    //属性对应的getter/setter
....
 public static void main(String[] args) {
       Demo d=null;
        System.out.println(d.getName());
//Exception in thread "main" java.lang.NullPointerException 空指针异常

        String stuName = " tom" ;
         int result = Integer.parseInt(stuName);
//java.lang.NumberFormatException: For input string: " tom" 数字转换异常
    }
}

```

* throws异常处理：还可以通过throws声明某个方法可能抛出的异常，使用throws声明的方法表示此方法不处理异常,而是交给方法的调用处进行处理。

### 第十二章小结：

理解异常是程序运行过程中发生的错误，即不正常的事情，异常会中止程序的运行。Throwable是所有异常类的父类；异常类分为Error和Exception两大类，程序中可以使用try-catch-finally对异常进行捕捉处理，也可以使用throws和throw进行，自定义异常类使开发人员更加方便地定义程序出错位置且更加详细地描述异常信息。

***

## 第十四章：集合类

* 特点：集合的长度是可变的，集合用来存放对象的引用

* 划分
  * java.lang.Object:
    * Collection
      * Set
        * HashSet
        * TreeSet
      * List
        * ArrayList
        * LinkedList
    * Map
      * HashMap
      * TreeMap

* Collection接口
  * add:对象添加到该集合中
  * remove：将指定的对象从该集合中移除
  * isEmpty()返回boolean值，判断当前集合是否为空
  * iterator()返回在此Collection的元素上进行迭代的迭代器
  * size()返回int型值，获取该集合中元素个数

* iterator迭代器

返回类型|方法|描述
:-:|:-:|:-:|
boolean|hashNext()|如果有元素可以迭代
Object|next()|返回迭代的下一个元素

* List集合:包含List接口和List接口所实现的类，List集合中的元素允许重复，各个元素的顺序就是对象插入的顺序
  * List接口：承接了Collection接口，包含所有Collection中的方法,还定义了两个重要的方法
    * ArrayList类：
      * 优势：实现可变数组，允许保存所有的元素，根据索引位置对集合进行快速的随机访问
      * 缺点：像指定的索引位置插入对象或删除对象的速度慢
    * LinkedList类：
      * 优势：采用链表结构保存对象。便于向集合插入和删除对象。
      * 缺点：对于随机访问集合中的对象，使用LinkedList类实现List集合的效率低

* Set集合：Set集合里面的对象不按特定的方式排序，并且不包含重复的对象，Set集合由Set接口和Set接口的实现类组成
  * HashSet类：实现Set接口，由哈希表支持，不保证Set的迭代顺序，此类允许使用null元素，HashSet类中没有提供根据集合索引对应值的方法，因此遍历HashSet时需要使用iterator迭代器
  * TreeSet类：实现Set接口，实现java.util.SorteSet接口，TreeSet类实现的Set集合在遍历集合时按自然顺序递增排序
    * TreeSet类增加的方法：
      * first():返回此Set中当前第一个元素
      * last():返回此Set中最后一个元素
      * comparator():返回对此Set中的元素进行排序的比较器。如果此Set使用自然顺序，则返回null

* Map接口：提供了将key映射到值的对象。一个映射不能包括重复的key,每个key最多只能映射到一个值。元素的存储顺序无序。
* 方法：
  * put(Object key,Object value)：向集合中添加指定的key和value的映射关系
  * get(Object key)根据key获取value

* 实现类
  * HashMap：基于哈希表的Map接口的实现，提供所有可选的映射操作，允许出现null键值，但必须保证键的唯一性，不保证映射的顺序恒久不变
  * TreeMap：实现Map接口，还是实现java.util.SortedMap接口，在添加和删除以及定位映射关系时，比HashMap类性能差，实现Map集合中的映射关系是根据键对象按照一定的顺序排序，因此不允许对象是null

### 第14章小结：

本章学习了3个常见集合，List、Set、Map集合,其中List集合是存储有序并且允许重复元素，常用的ArrayList实现类，类似可变数组，但是插入和删除要依据索引位置来所以效率不高，LinkedList虽然便于插入和删除，但是随机访问集合中的对象所以效率也不高，Set集合采用无序的方式存储并且不能包含重复元素，另有HashSet和TreeSet两个实现类，Map集合采用将键值对数据存储，不允许重复键，元素无序，有HashMap和TreeMap实现类

***

## 第十五章：I/O输入/输出

* 流:一组有序的数据序列，根据操作类型分为输入流，输出流

* 输入流：InputStream类是字节输入流的抽象类，所有字节输入流的父类，该类中所有方法遇到错误都会引发IOException异常
  * read():读取文件中的数据，一次读取一个字节，读取的数据作为返回值返回，如果读到文件末尾则返回-1，有可能抛异常，必须捕捉

  * read(byte[] b):读取文件中的数据，将读到的数据存放到byte型数组中，并返回读取的字节的数量，未读到数据返回-1，有可能抛异常，必须捕捉

  * close方法：关闭流对象，有可能抛异常，必须捕捉

  * 字符输入流的抽象类：Reader

* 输出流：OutputStream类是字节输出流的抽象类。OutputStream类中的所有方法均返回void，在遇到错误时引发IOException异常。
  * write(int b):将指定的字节写入输出流

  * flush()：彻底完成输出并清空缓存区

  * close():关闭输出流

  * 字符输出流的抽象类：Writer

* File类：java.io包中唯一代表磁盘文件本身的对象.

返回类型|方法|描述
:-:|:-:|:-:|
String|getName()|获取文件的名称
boolean|canRead()|判断文件是否为可读的
String|getAbsolutePath()|获取文件的绝对路路径
boolean|exits()|判断文件是否为存在

```文件创建
 //指定路径下创建文件
File file=new File("F:/Interllij IDEA/workpace/trunk/javase/src/unit15/sl/word.text");
    if ((file.exists())){
    file.delete();//判断文件是否存在，存在就删除
    System.out.println("文件删除");
        }else {
            try {  //try-catch扑捉文件的异常
                file.createNewFile();
                System.out.println("文件已经建立");
            } catch (IOException e) {
                e.printStackTrace();
            }
```

```字节流
 //读取数据：创建FileInputStream类对象
        try {
            FileInputStream in=new FileInputStream(file);
            byte byt[]=new byte[(int) file.length()];//根据文件长度创建字节数组
            in.read(byt);//读取的数据放入字节数组中
            String str=new String(byt);//利用字节数组创建字符串
            //将文件中的信息输出
            System.out.println(str);
            in.close();//关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }
```

* 文件输入/输出流:FileInputStream:向文件读取数据,FileOutputStream：向文件写入数据

* FileReader和FileWriter类

  * FileReader类称为文件读取流，允许以字符流的形式对文件进行读操作,只要不关闭流，每次调用read()方法就顺序地读取源中其余的内容
  * FileWriter类称为文件写入流，以字符流的形式对文件进行写操作

* BufferedInputStream和BufferedOutputStream类：分别继承Reader类和Writer类

* 数据输入/输出流：

* DataOutputStream类：DataOutputStream类可以输出任何类型的数据，配合FileOutputStream 使用：以便往文件中写入各种类型的数据

``` DataOutputSream
    File file=new File("path");
    FileOutputStream fos = new FileOutputStream(file);
    DataOutputStream dos = new DataOutputStream(fos);

```

* DataInputStream类可以输入任何类型的数据，但它不可以单独使用，配合FileInputStream 使用:从文件读取各种类型的数据

``` DataInputStream
    File file=new File("path");
    FileInputStream fis = new FileInputStream(file);
    DataInputStream dis = new DataInputStream(fis);

```

* zip压缩输入/输出流

* 压缩文件：利用ZipOutputStream类对象，可将文件压缩为.zip文件

### 第15小结：

Java中使用File类来实现创建、删除文件或目录的操作,输入输出流主要分为：字节流和字符流，在传输中较多使用字节流，字符流在操作时使用缓冲区，字节流不使用缓冲区,了解数据输入/输出流以及基本操作。

***

## 第十六章：反射

* 概述：JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。

* 利用Constructor访问构造方法：每个Constructor对象代表一个构造方法，利用Constructor对象可以操纵相应的构造方法。
  * getConstructors()
  * getConstructor(Class<?>... parameterTypes)
  * getDeclaredConstructors()
  * getDeclaredConstructor(Class<?>... parameterTypes)

* 使用Annotation功能
  * 定义Annotation信息：在定义Annotation类型时，也需要用到用来定义接口的interface关键字，不过需要在interface关键字前加一个“@”符号，即定义Annotation类型的关键字为@interface，这个关键字的隐含意思是继承了java.lang.annotation.Annotation接口。

```定义Annotiation类型
@Target(ElementType.CONSTRUCTOR)
// 用于构造方法
@Retention(RetentionPolicy.RUNTIME)
// 在运行时加载Annotation到JVM中
public @interface Constructor_Annotation {
    String value() default "默认构造方法";
    // 定义一个具有默认值的String型成员
}
```

* 访问Annotation：
  * 如果在定义Annotation类型时将@Retention设置为RetentionPolicy.RUNTIME，那么在运行程序时通过反射就可以获取到相关的Annotation信息，如获取构造方法、字段和方法的Annotation信息。
  * 类Constructor、Field和Method均继承AccessibleObject类，在AccessibleObject中定义了3个关于Annotation的方法，
    * 方法isAnnotationPresent用来查看是否添加了指定类型的Annotation，如果是则返回true，否则返回false；
    * 方法getAnnotation用来获得指定类型的Annotation，如果存在则返回相应的对象，否则返回null；
    * 方法getAnnotations()用来获得所有的Annotation，该方法将返回一个Annotation数组。

### 第16章总结：

掌握java反射机制的使用方法，利用java反射机制可以在程序运行是访问类的所有描述信息如：构造方法、成员变量等，实现逆向控制程序的执行过程。利用Annotation功能，可以对类、构造方法、成员变量、方法进行注释，在程序运行是通过反射可以读取这些信息。

***

## 第十七章：枚举类型与泛型

* 使用枚举类型设置常量：常量的修饰符：final和static,现在使用enum关键字定义枚举类型，使用枚举类型在编译时进行检查功能

* 操作枚举类型成员：可以将枚举类型看成是一个类，继承与java.lang.Enum类，每一个成员都被默认为public,final,static，直接用枚举类型名称调用成员

* values()改方法可以将枚举类型成员以数组的形式返回
* valuesOf()将普通字符串转为枚举类型
* ordinal()获取某个枚举对象的索引值

```定义枚举的构造方法
 Constants_A("我是枚举成员A"), // 定义带参数的枚举类型成员
        Constants_B("我是枚举成员B"), Constants_C("我是枚举成员C"), Constants_D(3);
        private String description;
        private int i = 4;
        private Constants2() {
        }
        // 定义参数为String型的构造方法
        private Constants2(String description) {
            this.description = description;
        }
```

* 泛型：
  * 概述:泛型在建立对象时不指定类中属性的具体类型，而是在声明及实例化对象时由外部指定。泛型可以提高数据安全性

  * 泛型对象定义：
    * 类名称<具体类> 对象名称 = new 类名称<具体类>();

  * 应用：
    * 泛型的类型参数只能是类类型，不能是简答的类型
    * 泛型的类型个数可以是多个
    * 可以使用extends关键字限制泛型的类型
    * 可以使用通配符限制泛型的类型

```泛型应用
    //统一集合List中元素的数据类型是Student类型
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student();
        stu1.setStuName("tom");
        stu1.setAge(20);
        Student stu2 = new Student();
        stu2.setStuName("jack");
        stu2.setAge(19);
        list.add(stu1);
        list.add(stu2);
        //list.add("java oop");
        //不允许将String类型元素添加至集合中
```

### 第十七章总结：

枚举类型安全性好，具有紧凑有效的数据定义，可以和其他程序完美交互。泛型是指建立对象时不指定类中属性的具体类型，而是在声明及实例化对象时由外部指定 。它可以解决数据安全性问题，其定义包含泛型类和泛型对象的定义。

***

## 第十八章多线程：

* 概念：程序可以同时完成多件事情。

* 特点：一个线程则是进程中的执行流程，一个进程可以同时包含多个线程，每个线程可以得到一小段程序的执行时间，这样一个进程就可以具有多个并发执行的线程。

* 实现线程的两种方式：
  * 继承Thread类：
    * public Thread(String threadName):创建一个名称为threadName的线程对象
    * public Thread():创建一个新的线程对象
    * 完成线程真正的功能的代码放在类的run()方法中，当一个类继承Thread类后，就可以在改类中覆盖run()方法，将实现该线程功能的代码写入run()方法，然后同时调用Thread类中的start()方法执行线程，就是调用run()方法。

```Thread实现多线程
 private  int num=20; //声明变量
    public void run(){
        //重写run方法
        while (true){
            System.out.print(num+" ");//打印数字num
            num--;
            if (num==0){
                System.out.println();
                break;//当等于0时候退出循环
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest t1=new ThreadTest();//实例化对象
        ThreadTest t2=new ThreadTest();
        t1.start();//启动线程
        //t1.start();继承Thread类受单继承影响，不适合多个线程共享资源
        t2.start();
    }
```

* 实现Ruunable接口
  * 步骤:
    * 建立Runnable对象
    * 使用参数为Runnable对象的构造方法创建Thread实例
    * 调用start()方法启动线程

```Runnable接口
public class RunnableTest implements Runnable{
    //实现Runnable接口
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
        new Thread(r2).start();  //启动线程
    }
}

```

* 线程的生命周期：线程具有生命周期，其中包含7种状态，分别为出生状态、就绪状态、运行状态、等待状态、休眠状态、阻塞状态和死亡状态。
  * 出生状态就是用户在创建线程时处于的状态，在用户使用该线程实例调用start()方法之前线程都处于出生状态；
  * 当用户调用start()方法后，线程处于就绪状态（又被称为可执行状态）；
  * 当线程得到系统资源后就进入运行状态。

![线程状态.png](https://i.loli.net/2018/05/14/5af8f874360bf.png)

* 操作线程的方法：
  * 线程的休眠：sleep()方法需要一个参数用于指定该线程休眠的时间，改时间以毫秒为单位
  * 线程的加入：当某个线程使用join()方法加入到另外一个线程时，另一个线程会等待该线程执行完毕再继续执行。
  * 线程的中断：在run()方法中使用无限循环的形式，然后使用一个布尔型标记控制循环的停止。
  * 线程的礼让：yield()方法使具有同样优先级的线程有进入可执行状态的机会，当当前线程放弃执行权时会再度回到就绪状态

* 线程的优先级：每个线程都具有各自的优先级，线程的优先级可以在程序中表明该线程的重要性，如果有很多线程处于就绪状态，系统会根据优先级来决定首先使哪个线程进入运行状态。但这并不意味着低优先级的线程得不到运行，而只是它运行的几率比较小，比如垃圾回收线程的优先级就较低。

* 线程的同步:同步是指在同一时间段内只能运行一个线程。
  * 同步块：同步机制使用synchronized关键字
  * 同步方法：Synchronized void 方法名称(参数列表){}

### 第18章总结：

* 理解进程与线程的概念
* 掌握多线程的实现
* 掌握使用线程同步解决线程安全
* 理解线程生命周期

***

## 第十九章：网络通信

* 局域网与因特网
  * 服务器是指提供信息的计算机或程序，
  * 客户机是指请求信息的计算机或程序，
  * 网络用于连接服务器与客户机，实现两者相互通信。但有时在某个网络中很难将服务器与客户机区分开。我们通常所说的“局域网”（Local Area Network，LAN），就是一群通过一定形式连接起来的计算机。它可以由两台计算机组成，也可以由同一区域内的上千台计算机组成。由LAN延伸到更大的范围，这样的网络称为“广域网”（Wide Area Network，WAN）。我们熟悉的因特网（Internet），则是由无数的LAN和WAN组成。

* 网络协议
  * ip协议：一种网络协议。IP地址采用4个字节，32位的二进制数表示IPv4
  * TCP协议：是一种以固连接线为基础的协议，它提供两台计算机间可靠的数据传送
* ServerSocket类：用于表示服务器套接字，其主要功能是等待来自网络上的“请求”，它可通过指定的端口来等待连接的套接字。服务器套接字一次可以与一个套接字连接。如果多台客户机同时提出连接请求，服务器套接字会将请求连接的客户机存入列队中，然后从中取出一个套接字，与服务器新建的套接字连接起来。若请求连接数大于最大容纳数，则多出的连接请求被拒绝。队列的默认大小是50。

```获取ip
 InetAddress ip; // 创建InetAddress对象
        try { // try语句块捕捉可能出现的异常
            ip = InetAddress.getLocalHost(); // 实例化对象
            String localname = ip.getHostName(); // 获取本机名
            String localip = ip.getHostAddress(); // 获取本IP地址
            System.out.println("本机名：" + localname);// 将本机名输出
            System.out.println("本机IP地址：" + localip); // 将本机IP输出
```

* ServerSocket类的构造方法都抛出IOException异常，分别有以下几种形式。
  * ServerSocket()：创建非绑定服务器套接字。
  * ServerSocket(int port)：创建绑定到特定端口的服务器套接字。
  * ServerSocket(int port, int backlog)：利用指定的backlog创建服务器套接字并将其绑定到指定的本地端口号。

* TCP网络程序：在网络编程中如果只要求客户机向服务器发送消息，不用服务器向客户机发送消息，称为单向通信。客户机套接字和服务器套接字连接成功后，客户机通过输出流发送数据，而服务器会使用输入流接收数据

* DatagramPacket类
  * DatagramPacket(byte[] buf , int length)
  * DatagramPacket(byte[] buf , int length , InetAddress address , int port)
  * 第一种构造函数创建DatagramPacket对象，指定了数据包的内存空间和大小。
  * 第二种构造函数不仅指定了数据包的内存空间和大小，而且指定了数据包的目标地址和端口。在发送数据时，必须指定接收方的Socket地址和端口号，因此使用第二种构造函数可创建发送数据的DatagramPacket对象。

### 第19章总结

* 掌握局域网与因特网
* 网络协议
* ServerSocket类
* TCP网络程序
* DatagramPacket类

***

## 第20章数据库操作

* 数据库：一种存储结构，它允许使用各种格式输入、处理和检索数据——不必在每次需要数据时重新输入它们。

* 数据库特点：
  * 实现数据共享。
  * 减少数据的冗余度。
  * 数据的独立性。
  * 数据实现集中控制。
  * 数据的一致性和可维护性，以确保数据的安全性和可靠性。

* SQL语言：结构化查询语言，使用SQL语言可以方便地查询、操作、定义和控制数据库中的数据。

  * 数据定义语言，如create、alter、drop等。
  * 数据操纵语言，如select、insert、update、delete等。
  * 数据控制语言，如grant、revoke等。
  * 事务控制语言，如commit、rollback等。

* JDBC:数据库连接，它提供了用于执行 SQL语句标准的Java API，可以方便实现多种关系数据库的统一操作； JDBC由一组用Java语言编写的类与接口组成

* 操作步骤
  * 加载驱动类;
  * 与数据库建立连接；
  * 执行SQL语句
  * 处理结果集
  * 关闭连接

* Connection接口：与特定的数据库的连接

![Connection](https://i.loli.net/2018/05/15/5afa3cc2453d5.png)

* Statement接口：用于创建向数据库中传递SQL语句的对象

![Statement接口](https://i.loli.net/2018/05/15/5afa3d543d2d6.png)

* PreparedStatement接口：PreparedStatement接口继承Statement，用于执行动态的SQL语句，通过PreparedStatement实例执行的SQL语句，将被预编译并保存到PreparedStatement实例中

![Statement接口与PreparedStatement接口比较](https://i.loli.net/2018/05/15/5afa3da7b2636.png)

* ResultSet接口:ResultSet接口类似于一个临时表，用来暂时存放数据库查询操作所获得的结果集.

![ResultSet接口](https://i.loli.net/2018/05/15/5afa3da7b01fa.png)

```查询
  PreparedStatement pst=null;  //声明预处理对象
        sql="select * from users where userId>?";
        try {
            pst=con.prepareStatement(sql); //实例化预处理对象
            pst.setInt(1,3);//设置参数
            rst=pst.executeQuery();//执行预处理语句
            System.out.println(pst.execute());
            while (rst.next()){
            System.out.println("编号："+rst.getInt("userId")+"姓名："+rst.getString("username"));
        }
```

``` 增加
System.out.println("=============增加操作=============");
        sql="insert into users values(default,?,?,?,null,null,null,null,default)"; //自增长id直接设置为Null
       try {
            con.setAutoCommit(false);//取消自动提交事务
            pst=con.prepareStatement(sql);
            pst.setString(1,"abc");
            pst.setInt(2,321);
            pst.setString(3,"abctest");
            if (!pst.execute()){
                con.commit();//成功后提交事务
                System.out.println("添加成功");
            }

        } catch (SQLException e) {
            try {
                con.rollback(); //失败后事务回滚
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
```

### 第20章总结：

* 了解数据库
* JDBC操作数库的步骤
* 掌握Connection、Statement、PreparedStatement、ResultSet接口
* 常用的SQL语句的操作
* 实现基本的增删改查功能
