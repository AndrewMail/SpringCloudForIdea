package com.data.entity;

import lombok.Data;

@Data
public class UserInfo {

    private long id;

    private String name;

    private String sex;

    private int age;

    public UserInfo(long id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
