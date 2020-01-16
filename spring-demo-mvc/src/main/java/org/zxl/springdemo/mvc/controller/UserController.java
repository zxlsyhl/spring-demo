package org.zxl.springdemo.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zxl.springdemo.mvc.entity.User;
import org.zxl.springdemo.mvc.interfaces.RolesManage;
import org.zxl.springdemo.mvc.service.IUserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RolesManage(roles = "manage")
    @RequestMapping("/getList")
    @ResponseBody
    public List<User> getList(){
        return userService.getList();
    }

    @RolesManage(roles = "boss")
    @RequestMapping(value = "/setList",method = RequestMethod.GET)
//    @ResponseBody
    public String setList(){
        return "set success";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "/index";
    }


    @RequestMapping("/getList2")
    @ResponseBody
    public List<User> getList2(){
        List<User> users = userService.getList2();
        for (User user:users){
            System.out.println("**************");
            System.out.println(user);
            System.out.println(user.getSex());
        }
        return users;
    }
}
