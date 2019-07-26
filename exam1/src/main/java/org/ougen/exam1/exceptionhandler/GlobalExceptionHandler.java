package org.ougen.exam1.exceptionhandler;

import org.ougen.exam1.model.Model;
import org.ougen.exam1.util.ModelUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Author: OuGen
 * Discription:
 * Date: 13:52 2019/7/26
 */
@RestControllerAdvice(basePackages="org.ougen.exam1.controller")
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Model handler(Exception e){
        return ModelUtil.getModel("fail",-1,e);
    }
}
