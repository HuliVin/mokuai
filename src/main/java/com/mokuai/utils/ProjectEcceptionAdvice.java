package com.mokuai.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//作为springmvc的异常处理器
@ControllerAdvice
@RestControllerAdvice
public class ProjectEcceptionAdvice {
    //拦截所有的异常
    @ExceptionHandler
    public R doException(Exception ex){
       //记录日志
        //通知运维
        //通知开发
        ex.printStackTrace();
        return  new R("请联系开发人员");
    }

}
