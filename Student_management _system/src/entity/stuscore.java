package entity;
/*
 *1.创建分数的实体类
 * 2.创建变量
 */
public class stuscore {
    private Integer sid;  //分数id
    private Integer stunum; //学号
    private Integer cid; //课程id
    private Integer score;//分数

    public stuscore() { //无参构造方法
    }
    //创建变量的set ,get方法用来赋值和取值

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getStunum() {
        return stunum;
    }

    public void setStunum(Integer stunum) {
        this.stunum = stunum;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
