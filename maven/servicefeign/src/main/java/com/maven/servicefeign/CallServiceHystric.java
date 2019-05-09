package com.maven.servicefeign;

import org.springframework.stereotype.Component;
//第三步：重写接口方法
@Component
public class CallServiceHystric implements CallService {

    @Override
    public String sayHiFromClientOne(String name) {
        return  "sorry "+name;
    }
}
