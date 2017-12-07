package com.lym.ssm.interceoptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by dllo on 17/12/1.
 */
public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object o) throws Exception {
        //1.获取到客户端访问的url地址，判断是否是登录地址
        String url = req.getRequestURI();
        if (url.contains("login")){
            //放行
            return true;
        }
        //2.获取Session，判断是否有登录信息，如果有，放行
        HttpSession session = req.getSession();
        if (session.getAttribute("loginMsg") != null){
            return true;
        }
        //3.如果没有登录信息，转发到登录页面
        req.getRequestDispatcher("register.html").forward(req,resp);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
