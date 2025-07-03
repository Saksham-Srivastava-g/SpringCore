package com.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch5 {
     public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeBean2 emp = (EmployeeBean2) ac.getBean("empbean2");
        emp.test();
        
     }
}
