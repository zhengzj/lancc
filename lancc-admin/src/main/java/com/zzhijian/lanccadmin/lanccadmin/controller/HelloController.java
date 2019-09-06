package com.zzhijian.lanccadmin.lanccadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: 控制器
 *
 * @author zhijian.zheng@ucarinc.com
 * @package: com.zzhijian.lanccadmin.lanccadmin.controller
 * @date: 2019-09-06 13:28
 **/
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello world!!";
    }

}
