package com.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch2 {
 public static void main(String[] args) {
    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    Demo demo = (Demo)ac.getBean("demo");

 }
}
