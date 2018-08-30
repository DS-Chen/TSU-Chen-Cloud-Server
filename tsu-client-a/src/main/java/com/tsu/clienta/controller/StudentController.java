package com.tsu.clienta.controller;

import com.tsu.clienta.mapper.StudentCourseMapper;
import com.tsu.common.vo.DataResponseVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chendongsuo
 * @create 2018-08-30 16:31
 * @email dongsuo.chen@nvr-china.com
 * @description 学生controller
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/client-a")
public class StudentController {

    @Autowired
    StudentCourseMapper studentCourseMapper;

    @RequestMapping(value = "/studentCourseInfo", method = RequestMethod.GET, produces = {"application/json"})
    public DataResponseVo findStudentCourseInfo() {
        return new DataResponseVo(0, studentCourseMapper.findStudentCourseInfo());
    }
}
