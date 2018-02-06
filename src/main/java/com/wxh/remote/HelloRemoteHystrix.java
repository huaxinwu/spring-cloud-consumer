package com.wxh.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  熔断器 回滚处理(降级)
 * @auther wxh
 * @date 2018/1/26 14:55
 */
@Component
public class HelloRemoteHystrix  implements HelloRemote{
    /**
     *  实现调用远程服务接口
     * @param name
     * @return String
     */
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        // 如果请求失败，返回失败消息
        return "hello " + name + ", this message send failed";
    }
}
