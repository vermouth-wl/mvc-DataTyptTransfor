package com.mvc.controller;

import com.mvc.entity.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname UserController
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-02 16:19
 * @Version 1.0
 **/
@Controller
public class UserController {

    /* 创建index()方法 */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    /* 创建dataTypeTrans()方法 */
    @RequestMapping(value = "/dataTypeTrans", method = RequestMethod.POST)
    public String dataTypeTrans(@ModelAttribute User user, Model model){
        System.out.println("使用ConversionService接收前端数据为: " + user.getUsername() + "----" + user.getBirthday());
        model.addAttribute("user", user);
        return "success";
    }

    /* 创建initBinder()方法，请求该视图 */
    @RequestMapping(value = "/initBinder", method = RequestMethod.GET)
    public String initBinder(){
        return "initBinder";
    }

    /* 创建testInitBinder()方法 */
    @RequestMapping(value = "/testInitBinder")
    public String testInitBinder(User user1, Model model){
        System.out.println("使用InitBinder注解接收前端数据为: " + user1.getUsername() + "----" + user1.getBirthday());
        model.addAttribute("user1", user1);
        return "success1";
    }

    /* 创建initBinder()方法 */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }
}
