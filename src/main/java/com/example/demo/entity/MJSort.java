package com.example.demo.entity;

/**
 * @description: 假按揭啊
 * @author: zhangnianzhong
 * @email: zhangnianzhong@egret.com
 * @datetime: 2019/8/27 10:11
 * @version: 1.0.0
 */
public enum MJSort {

    SORT("101","哈哈");

    public String getErrorCode() {
        return errorCode;
    }
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
    * @Description: 错误码
    * @author: YunZhao.Wang
    * @date: 2020-12-09 18:10
    * @version:
    */
    private String errorCode;

    /**
     * @Description: 错误信息
     * @author: YunZhao.Wang
     * @date: 2020-12-09 18:10
     * @version:
     */
    private String errorMsg;

    MJSort(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
