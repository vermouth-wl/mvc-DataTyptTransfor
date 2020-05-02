package com.mvc.entity;

import java.util.Date;

/**
 * @Classname User
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-02 17:00
 * @Version 1.0
 **/
public class User {
    private String username;
    private Date birthday;

    public User(){}

    public User(String username, Date birthday){
        this.username = username;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
