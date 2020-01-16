package org.zxl.springdemo.mvc.filter;

import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 继承抽象类OncePerRequestFilter
 */
public class SessionFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //不过滤的uri
        String[] notFilter = new String[]{"/hello"};


        //请求的uri
        String uri = request.getRequestURI();
        System.out.println("filter>>>uri>>>"+uri);

        //是否过滤
        boolean doFilter = true;
        for(String s : notFilter){
            if(uri.indexOf(s) != -1){
                //uri中包含不过滤uri，则不进行过滤
                doFilter = false;
                break;
            }
        }
        String name = request.getHeader("name");
        System.out.println("SessionFilter doFilterInternal invoke");
        if("name".equals(name)){
            System.out.println("SessionFilter doFilterInternal true");
//            if(doFilter){
//                response.sendRedirect("/error.jsp");
//            }else{
//                ServletOutputStream outputStream = response.getOutputStream();
//                outputStream.write("no no no".getBytes());
//                outputStream.flush();
//                outputStream.close();
//            }
            ServletOutputStream outputStream = response.getOutputStream();
            outputStream.write("no no no".getBytes());
            outputStream.flush();
            outputStream.close();
        }else{
            System.out.println("SessionFilter doFilterInternal false");
            //不执行过滤操作
            filterChain.doFilter(request, response);
        }
    }

    /**
     * is Ajax request
     * @param request
     * @return
     */
    private boolean isAjaxRequest(HttpServletRequest request) {
        String header = request.getHeader("X-Requested-With");
        if(header != null && "XMLHttpRequest".equals(header)){
            //ajax request
            return true;
        }else{
            //traditional sync http request
            return false;
        }
    }

}
