package com.maven.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//第二步：只需要在FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类就行了（注意：等号后面部分没得引号）
//第三步：新建fallback定义的类并实现接口，重写接口中的方法
@FeignClient(value = "eurekaclient",fallback = CallServiceHystric.class)
    public interface CallService{
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
