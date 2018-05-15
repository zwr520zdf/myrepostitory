package entity;
/*
 *1.创建学生的实体类
 * 2.创建变量
 */
public class student {
    private Integer sid;//id
    private String  stuname; //学生姓名
    private String stunum;//学号
    private Integer age;//年龄
    //构造方法
    public student() {
    }

    //创建变量的set ,get方法用来赋值和取值
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
