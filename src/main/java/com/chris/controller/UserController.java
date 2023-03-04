package com.chris.controller;

import com.chris.pojo.Users;
import com.chris.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findall")
    public List<Users> all(){
        return userService.findAll();
    }


    //分页
    @RequestMapping("findallbypage")
    public PageInfo<Users> findAllByPage(Integer pageNo,Integer pageSize){

        PageHelper.startPage(pageNo,pageSize);
        List<Users> allUsers = userService.findAll();
        PageInfo<Users> pageInfo=new PageInfo<>(allUsers);
        return pageInfo;
    }

}
