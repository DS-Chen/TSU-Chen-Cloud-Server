package com.tsu.clienta.entity;

import java.util.List;

/**
 * @author chendongsuo
 * @create 2018-08-30 16:33
 * @email dongsuo.chen@nvr-china.com
 * @description 学生实体
 */
public class Student {

    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    /**
     * 多对多
     */
    private List<Course> courses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
