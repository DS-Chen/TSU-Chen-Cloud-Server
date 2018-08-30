package com.tsu.clienta.entity;

import java.util.List;

/**
 * @author chendongsuo
 * @create 2018-08-30 16:33
 * @email dongsuo.chen@nvr-china.com
 * @description 课程实体
 */
public class Course {

    private Integer id;
    private String name;
    private Integer credit;
    /**
     * 多对多
     */
    private List<Student> students;


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

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
