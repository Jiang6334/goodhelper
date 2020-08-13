package com.okgo.goodhelper.utils;

import com.okgo.goodhelper.pojo.nopojo.RTVO;

/**
 * 代
 * 返回数据的工具类
 */
public class RTVOUtil {

    public static RTVO success(Object object){
        RTVO resultVO = new RTVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }


    public static RTVO success(){
        return success(null);
    }


    public static RTVO error(int code,String msg){
        return error(code,msg,null);
    }

    public static RTVO error(int code,String msg,Object object){
        RTVO resultVO = new RTVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        resultVO.setData(object);
        return resultVO;
    }
}