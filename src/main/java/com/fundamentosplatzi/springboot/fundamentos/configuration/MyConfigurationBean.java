package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement(); //new para instanciar
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement(); //new para instanciar
    }

    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation){
        return new MyBeanWithDepencencyImplement(myOperation); //new para instanciar
    }
}
