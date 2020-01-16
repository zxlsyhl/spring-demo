package org.zxl.springdemo.mvc.enums;

public enum UserSex implements BaseEnum{
    MAN(1,"男"),WOMEN(2,"女");
    private Integer sex;
    private String desc;

    UserSex(Integer sex, String desc) {
        this.sex = sex;
        this.desc = desc;
    }


    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
