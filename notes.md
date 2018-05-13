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

5. for循环
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
* 选择排序法

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

***

## 第九章：数字处理类

* Math类：提供众多的数学函数
* 正弦：Math.sin()，求平方：Math.pow(,)
* 返回大于等于参数的最小整数：Math.ceil()
* 返回小于等于参数的最大整数：Math.floor()
* Random类：java编译器以系统当前时间作为随机数生成器的种子
* BigInteger针对大整数的处理类和BigDecimal针对大小数的处理类。

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

2. Objcet类：java.lang.Object类是所有类的父类
    * Object类中的getClass()、notify()、notifyAll()、wait()等方法不能被重写，因为这些方法被定义为final类型

3. 重载：方法名字相同,参数类型，参数个数，参数顺序不同
    * 在同一个类中
    * 方法名一样
    * 参数列表不一样
    * 跟返回值类型没有关系

4. 多态:一个对象的某种行为有多种实现方式
    * 多态实现的方式：重载和重写

5. 抽象类:使用关键字abstract修饰的类
    * 1.抽象类不能实例化
    * 2.抽象类可以有构造方法
    * 3.可以有非抽象类中用于的一切
    * 4.抽象类中可以有抽象方法(使用abstract修饰的方法，且没有方法的具体实现--即没有大括号分号结尾)
    * 5.存在抽象方法的类一定是抽象类
    * 6.子类继承抽象类必须要实现其抽象方法，除非子类本身也是抽象类（即子类必须重写抽象方法）
    * 7.抽象方法不能是static和final和private：这三个修饰的都不能被重写，抽象方法需要被重写
    * 8.final修饰的方法不能被重写

6. 接口:使用interface关键字修饰的
    * 接口中定义方法必须定义为：public或abstract
    * 接口中定义的任何字段都是静态常量:public static final可以省略
    * 接口支持多继承
    * 接口不能实例化  接口没有构造方法
    * 实现接口使用implements关键字
    * 必须实现接口所有的方法（除非本身就是抽象类接口）
    * 静态方法不能被子类重写（覆盖），因此接口中不定声明静态方法
    * 实现多个接口用逗号隔开
    * 接口里面的方法用;结束

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

***

## 第十二章：异常处理

* 错误：异常产生后,不做任何处理，程序会被终止。

* 异常的捕捉：由try catch finally组成
  * try语句块: 可能发生异常的java语句
  * catch：在try后面，用来激发被捕捉的异常
  * finally：最后执行的部分，无论try语句块中的代码，如何退出，都将执行finally语句块

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

### 小结：

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

### 小结：Java中使用File类来实现创建、删除文件或目录的操作,输入输出流主要分为：字节流和字符流，在传输中较多使用字节流，字符流在操作时使用缓冲区，字节流不使用缓冲区,了解数据输入/输出流以及基本操作。

***

## 第十七章：枚举类型与泛型

* 使用枚举类型设置常量：常量的修饰符：final和static,现在使用enum关键字定义枚举类型，使用枚举类型在编译时进行检查功能

* 操作枚举类型成员：可以将枚举类型看成是一个类，继承与java.lang.Enum类，每一个成员都被默认为public,final,static，直接用枚举类型名称调用成员

* values()改方法可以将枚举类型成员以数组的形式返回
* valuesOf()将普通字符串转为枚举类型
* ordinal()获取某个枚举对象的索引值

* test)00000000000000000000000000
* sssss