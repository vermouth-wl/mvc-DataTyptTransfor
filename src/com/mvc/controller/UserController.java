package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Classname UserController
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-02 16:19
 * @Version 1.0
 **/
@Controller
public class UserController {

    /* 创建index方法 */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
