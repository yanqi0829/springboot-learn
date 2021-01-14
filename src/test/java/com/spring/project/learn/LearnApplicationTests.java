package com.spring.project.learn;

import com.spring.project.learn.bean.Cat;
import com.spring.project.learn.bean.Cat01;
import com.spring.project.learn.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootTest
class LearnApplicationTests {
    @Autowired
    Person person;
    @Autowired
    Cat cat;
    @Autowired
    Cat01 cat01;
    @Autowired
    ApplicationContext ioc;

    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(cat);
        System.out.println(cat01);
    }
    @Test
    void test(){
        System.out.println(ioc.containsBean("123"));
    }
}
