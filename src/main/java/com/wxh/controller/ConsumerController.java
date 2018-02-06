package com.wxh.controller;

import com.wxh.remote.HelloRemote;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  服务调用者
 * @auther wxh
 * @date 2018/1/26 11:43
 */
@RestController
public class ConsumerController {

    /**
     *  注入HelloRemote，调用远程服务
     */
    @Resource
    private HelloRemote helloRemote;

    /**
     *  参数作为变量传进来
     * @return String
     */
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name){
        // 调用远程服务提供的服务或者数据
        return helloRemote.hello(name);
    }
}
