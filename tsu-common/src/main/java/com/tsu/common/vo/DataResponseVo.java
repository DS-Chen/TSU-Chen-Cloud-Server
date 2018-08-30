package com.tsu.common.vo;

import java.io.Serializable;

/**
 * @author chendongsuo
 * @create 2018-07-03 10:52
 * @email dongsuo.chen@nvr-china.com
 * @description 返回数据
 */
public class DataResponseVo extends BaseResponseVo implements Serializable {
    private static final long serialVersionUID = -2444653964387825527L;

    private Object content;

    public DataResponseVo(Object content) {
        this.content = content;
    }

    public DataResponseVo(int code) {
        super(code);
    }

    public DataResponseVo(int code, Object content) {
        super(code);
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
