package com.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Pojo.Controller;

public class Launch4 {
    public static void main(String[] args) {
            ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
           Controller controller = (Controller) ac.getBean("controller");

           controller.doGet();
           controller.doPost();
    }
}
