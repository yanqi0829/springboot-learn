package com.spring.project.learn.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@PropertySource(value = {"classpath:cat.properties"})
@Component
@ConfigurationProperties(prefix = "cat")
public class Cat01 {
    private String name01;
    private Integer age01;

    public String getName01() {return name01;}

    public void setName01(String name01) {
        this.name01 = name01;
    }

    public Integer getAge01() {return age01;}

    public void setAge01(Integer age01) {
        this.age01 = age01;
    }

    @Override
    public String toString() {
        return "Cat01{" +
                "name01='" + name01 + '\'' +
                ", age01=" + age01 +
                '}';
    }
}
