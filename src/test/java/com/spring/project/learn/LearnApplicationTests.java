package com.spring.project.learn;

import com.spring.project.learn.bean.Cat;
import com.spring.project.learn.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnApplicationTests {
    @Autowired
    Person person;
    @Autowired
    Cat cat;

    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(cat);
    }
}
