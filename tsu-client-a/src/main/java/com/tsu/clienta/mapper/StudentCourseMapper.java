package com.tsu.clienta.mapper;

import com.tsu.clienta.entity.Student;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chendongsuo
 * @create 2018-08-30 16:36
 * @email dongsuo.chen@nvr-china.com
 * @description 学生课程mapper
 */
@Mapper
@Repository
public interface StudentCourseMapper {
    /**
     * 查询学生课程
     *
     * @return {@link List<Student>}
     */
    List<Student> findStudentCourseInfo();
}
