package com.maven.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient         //加注解报错，直接右键项目选maven--》Reimport，再打开右侧边框上的Maven点击刷新
@EnableDiscoveryClient
@EnableZuulProxy        //开启zuul的功能
/**
 * 史上最简单的SpringCloud教程 | 第五篇: 路由网关(zuul)(Finchley版本)
 * https://blog.csdn.net/forezp/article/details/81041012#commentsedit
 *
 * 启动报错多是因为boot和cloud版本不一致，把父项目中的cloud版本Finchley.RELEASE修改为Greenwich.RELEASE即可。记得从新更新一下maven仓库，右边maven点开，里边的刷新按钮
 * Finchley.RELEASE对springboot2.0支持，Greenwich.RELEASE对springboot2.1支持
 *
 * 启动后页面访问504，多是配置默认的断路时间太短，在yml文件中加上ym中标注部分即可（https://blog.csdn.net/weixin_43866856/article/details/84890013）
 */

public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

}
