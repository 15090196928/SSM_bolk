package junxia.ma.model;

import javax.persistence.criteria.CriteriaBuilder;

public class User {

    private String name;
    private String Mobile;
    private String home;
    private String sex;
    private Integer num;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", home='" + home + '\'' +
                ", sex='" + sex + '\'' +
                ", num=" + num +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
