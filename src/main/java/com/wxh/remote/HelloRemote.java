package com.wxh.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *   调用远程服务
 *   feign调用实现
 *   1.注解里，name:远程服务名，及spring.application.name配置的名称
 *
 *   3. 指定熔断器处理类
 * @auther wxh
 * @date 2018/1/26 11:33
 */
@FeignClient(name = "spring-cloud-provider", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    /**
     *  2.此类中的方法和远程服务中contoller中的方法名和参数需保持一致
     * @param name
     * @return String
     */
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
