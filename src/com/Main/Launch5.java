package com.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.Controller;

public class Launch5 {
     public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Controller con = (Controller)ac.getBean("controller2");
        con.doPost();
        
     }
}
