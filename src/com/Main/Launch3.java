package com.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch3 {
public static void main(String[] args) {
    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
     System.out.println(" Raju Account creation");

     Account acc1 = (Account) ac.getBean("acc");
     acc1.setUsername("Raju123");
     acc1.setPassword("1234");
     acc1.setFullName("raju shukla");
     acc1.setAddress("kanpur");
     System.out.println(acc1);

     System.out.println(" kaju Account creation");

     Account acc2 = (Account) ac.getBean("acc");
     acc2.setUsername("kaju123");
     acc2.setPassword("1234");
     acc2.setFullName("kaju shukla");
     acc2.setAddress("ganpur");
     System.out.println(acc2);
      
System.out.println("*********BOTH DETAILS****************");

System.out.println(acc1);
System.out.println(acc2);

}

}
