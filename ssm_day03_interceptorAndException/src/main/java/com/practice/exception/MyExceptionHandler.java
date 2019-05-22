package com.practice.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
       /* mv.addObject("errorMsg","代码在维护....");
        // 当发生异常时,重定向到错误友好页面
        //mv.setViewName("redirect:error.jsp");
        // 请求转发到错误页面(需要携带错误信息)
        mv.setViewName("forward:error.jsp");*/

        // 判断是否是service层的异常
        if(e instanceof Myexception){
            Myexception exception = (Myexception)e;
            mv.addObject("errorMsg",exception.getMessage());
            mv.setViewName("forward:error.jsp");
        }else{
            mv.setViewName("redirect:error.jsp");
        }
        return mv;
    }
}
