package com.tsu.common.vo;

import java.io.Serializable;

/**
 * @author chendongsuo
 * @create 2018-07-03 10:53
 * @email dongsuo.chen@nvr-china.com
 * @description 数据结构
 */
public class BaseResponseVo implements Serializable {
    private static final long serialVersionUID = -1884968440534194529L;
    private int code;

    public BaseResponseVo() {
    }

    public BaseResponseVo(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
