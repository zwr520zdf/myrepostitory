# 学生管理系统

* 内容介绍：此学生管理系统是一个对前面javase知识整合的小项目，应用控制台输入界面，连接Mysql数据库，采用dao-entity-ui即数据访问—实体类层-应用层的方式进行开发，实现数据库基本的增删改查的功能，对学生的信息进行多样化的管理。

* 功能能描述：
  * 添加学生：从控制台输入学生信息和三个科目的分数，分别对stuent(学生表)、stuscore(成绩表)进行插入

  * 删除学生：首先在Mysql数据库里面对外键设置级联删除，从控制台输入删除的学生学号，只需对stuent(学生表)进行删除即可

  * 更新学生：从控制台输入选择信息更新还是分数更新，
    * 信息更新：从控制台输入学号，对stuent(学生表)进行姓名和年龄的更新
    * 分数更新：从控制台输入学号，再输入要更新的科目。完成分数输入。

  * 查询学生信息：从控制台输入学号，采用多表连接，将学生信息和学生的科目分数查询出来

  * 查询高于某分数学生：从控制台输入科目，再输入分数线，显示出高于某分数段的学生

  * 查询学生平均分：从控制台输入学号，使用AVG求出平均分，返回学生总成绩的平均分

  * 查询学科平均分：从控制台输入科目，使用AVG求出平均分，返回学科的平均分

  * 查询所有学生成绩：使用多表连接，按学生总成绩升序排列打出

  * 校验：校验专门写一个check类，每次校验直接调用check类
    * 学号校验：通过控制输入学号，结合sql语句查询是否有相关人的信息，放入list集合中，判读集合是否空，如果为空则代表，无此学号

    * 科目校验：通过控制台输入字符串数据，用while+switch判断是否符合三个科目

    * 分数判断：利用if判断是否为0~100分数的数字

* 简要流程图：
![绘图1.jpg](https://i.loli.net/2018/05/15/5afaeb9f7051f.jpg)

* 技术应用说明：
  * DBManager工具类：将数据库连接，加载驱动，以及利用preparedStatement实现的增删改成功能封装成一个DBManager工具类，以后数据库连接还有增删改功能都直接调用DBManager即可。

  * 利用while(true)循环打印功能界面

  * 利用switch-case判断哪个功能被选中

  * 利用标签名+break;跳出指定的循环体

  * 使用集合泛型存储对象

  * 使用foreach循环遍历list集合

  * 使用pravite修饰变量，利用get-set方法取值赋值

  * Check工具类：将学号，学科，分数的校验写在一个类中供dao层应用

* 亮点展示：

* 查询所有学生信息

![查询学生所有成绩](https://i.loli.net/2018/05/15/5afae0d029f55.png)

* 分类更新

![分类更新](https://i.loli.net/2018/05/15/5afae128a41c2.png)

* 封装增删改的功能

```封装增删改的功能
 public static boolean executeUpdate(String sql,Object[] obj){
        boolean result=false;
        Connection conn=getConnection();
        PreparedStatement stm=null;
        try {
            stm=conn.prepareStatement(sql);
            for (int i=0;obj!=null && i<obj.length;i++) {
                stm.setObject(i+1, obj[i]);
            }
            int num=stm.executeUpdate();
            if(num>0){
                result=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            closeAll(conn,null,stm);
        }
        return result;
```

## 总结：此次项目，虽然只是简单采用控制台输入，但是很好把javase的知识整合了，通过这个项目我也发现自己还有许多不足，例如sql语言编写，数据库的建立方式，以及集合中map集合应用等需要提高，虽然是个小项目，但是很考验前面基础自学的情况，最近因为学校论文的事情，以及个人事情，导致进度落后半天，没有按时完成任务，在此表示道歉！希望这次一方面是对自己后半段学校任务的警示，另一方面也是对自己编码速度和基础学习要加强提高。