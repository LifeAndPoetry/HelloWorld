package com.maven.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service//一开始忘了给这个注释，controller中实例的时候报不能Autowired
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")//第三步：该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符串
    public String showService(String name){
        System.out.println("HelloService中---------------------："+name);
        return restTemplate.getForObject("http://EUREKACLIENT/hi?name="+name,String.class);
    }

    public String hiError(String name) {//第四步:创建第三步定义的方法
        return "hi,"+name+",sorry,error!";
    }
}
