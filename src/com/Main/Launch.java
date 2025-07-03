package com.Main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Launch {
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    ClassPathResource classPathResource = new ClassPathResource("bean.xml");
    XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(classPathResource);
    Demo demo = (Demo)xmlBeanFactory.getBean("demo");
    
     demo.test();
    System.out.println("exit");
  }
}
