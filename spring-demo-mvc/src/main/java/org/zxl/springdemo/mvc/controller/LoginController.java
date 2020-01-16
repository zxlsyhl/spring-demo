package org.zxl.springdemo.mvc.controller;

import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/loginIn")
    @ResponseBody
    public String loginIn(HttpServletRequest request){
        String name = request.getParameter("name");
        if("zhangsan".equals(name)){
            request.getSession().setAttribute("name",name);
            return "success";
        }
        else {
            return "fail";
        }
    }
}
