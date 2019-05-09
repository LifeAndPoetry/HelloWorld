package com.maven.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 史上最简单的SpringCloud教程 | 第二篇: 服务消费者（rest+ribbon）(Finchley版本)
 * https://blog.csdn.net/forezp/article/details/81040946
 * Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign。
 * ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon。
 */
@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注册进Eureka服务中
@EnableDiscoveryClient//服务发现
@EnableHystrix          //第二步：加入注解开启Hystrix  第三步在serice中
public class ServiceribbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceribbonApplication.class, args);
    }

    @Bean   //向程序的ioc注入一个bean:
    @LoadBalanced   //表明这个restRemplate开启负载均衡的功能
    RestTemplate restTemplate(){    //org.springframework.web.client包中的一个对象
        return  new RestTemplate();

    }
}
