package org.zxl.springdemo.mvc.interceptors;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.zxl.springdemo.mvc.interfaces.RolesManage;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录角色拦截器，结合自定义注解。
 */
public class RoleInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("RoleInterceptor preHandle invoke");
        String role = request.getHeader("role");
        role = role==null?"":role;
        System.out.println("RoleInterceptor preHandle role:"+role);

        HandlerMethod methodHandler=(HandlerMethod) handler;

        ResponseBody responseBody=methodHandler.getMethodAnnotation(ResponseBody.class);
        RolesManage auth=methodHandler.getMethodAnnotation(RolesManage.class);
        //如果@AuthLoginAnnotation (check=false) 这里的auth为false,即不用进行拦截验证，@AuthCheckAnnotation默认为前面定义的true　　
        if(auth!=null){
            if(auth.roles().contains(role)){
                System.out.println("RoleInterceptor preHandle 拥有权限");
                return true;
            }
            else {
                System.out.println("RoleInterceptor preHandle 没有权限");
                return false;
            }
        }else {
            System.out.println("RoleInterceptor preHandle 无权限控制");
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
}
