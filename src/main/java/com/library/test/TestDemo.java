package com.library.test;

import com.library.service.ClassInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void searchAllTest(){
        //获取Spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
        //获取bean
        ClassInfoService classInfoService= (ClassInfoService) applicationContext.getBean("classInfoService");
        classInfoService.queryClassInfoAll();
    }
}
