package com.maven.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 史上最简单的SpringCloud教程 | 第三篇: 服务消费者（Feign）(Finchley版本)
 * https://blog.csdn.net/forezp/article/details/81040965
 * 它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。
 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 */
@SpringBootApplication
@EnableEurekaClient         //本服务启动后会自动注册进Eureka服务中
@EnableDiscoveryClient      //服务发现
@EnableFeignClients        //注解开启Feign的功能
public class ServicefeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicefeignApplication.class, args);
    }

}
