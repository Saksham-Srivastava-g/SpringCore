package com.Main;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeBean {
    static{
        System.out.println("bean loading");
    }
    public EmployeeBean(){
          System.out.println("bean isntatiation");
    }
    // public void myXmlInit(){
    //     System.out.println("Source alloacation");
    // }
      @PostConstruct
      public void myAnnoInit(){
        System.out.println("Source alloacation");
    }
    
    public void test(){
          System.out.println("custom method");
    }
    @PreDestroy
    public void myAnnoDestroy(){
        System.out.println("Source delloacation");
    }
    // public void myXmlDestroy(){
    //     System.out.println("Source dealloacation");
    // }
}
