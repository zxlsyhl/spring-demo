package org.zxl.springdemo.mvc.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 实现javax.servlet.Filter接口，
 */
public class PermissionFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("PermissionFilter init invoke");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse)servletResponse;
        System.out.println("PermissionFilter doFilter invoke");
        if(!"name2".equals(httpServletRequest.getHeader("name"))){
            filterChain.doFilter(httpServletRequest,servletResponse);
        }
        else{
            ServletOutputStream outputStream = httpServletResponse.getOutputStream();
            outputStream.write("doFilter fail".getBytes());
            outputStream.flush();
        }
    }

    public void destroy() {
        System.out.println("PermissionFilter destroy invoke");
    }
}
