package com.wxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 *  1. pom添加依赖配置
 *  2. application配置服务端口、名称等信息
 *  3. 在启动类使用注解EnableDiscoveryClient，启用服务注册与发现
 *  	注解EnableFeignClients启用feign进行远程调用
 *  4.feign调用实现：
 *  	1. 注解里name:远程服务名，及spring.application.name配置的名称
 *  	2. 此类中的方法和远程服务中contoller中的方法名和参数需保持一致
 *  5.web层调用远程服务,将HelloRemote注入到controller层，像普通方法一样去调用即可
 *  6. 配置Hystrix Dashboard监控和熔断器，保证服务的可用和排查
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringCloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerApplication.class, args);
	}
}
