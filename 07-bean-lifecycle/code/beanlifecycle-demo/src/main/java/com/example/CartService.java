package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class CartService implements BeanNameAware,ApplicationContextAware/*,InitializingBean,DisposableBean*/{

    
    Map<Integer,String> map;
    public CartService(){
        map=new HashMap<>();
        System.out.println("Cartservice constructer called");
       
    }
    @Override
    public void setBeanName(String name){
        System.out.println("Bean name is "+ name);
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
        System.out.println("Application name is "+ applicationContext.getClass().getSimpleName());
    }


    @PostConstruct
    public void init(){
        map.put(1, "sony");
        map.put(2, "abcd");
        System.out.println("Postconstruct initialized");
    }
    @PreDestroy
    public void destroy(){
        map.clear();
        System.out.println("bean is getting destroyed");
    }
    /* @Override
    public void afterPropertiesSet() throws Exception{
        map.put(1, "sony");
        map.put(2, "abcd");
        System.out.println("IntializingBean interface initialized");
    }
    @Override
    public 	void destroy() throws Exception{
        map.clear();
        System.out.println("bean is getting destroyed");
    } */
    
    /* public void start(){
        map.put(1, "sony");
        map.put(2, "abcd");
        System.out.println("Custom initialzation method initialized");
    }
    public void stop(){
        map.clear();
        System.out.println("bean is getting destroyed");
    } */

    public String getKey(Integer key){
        return map.get(key);
    }
}