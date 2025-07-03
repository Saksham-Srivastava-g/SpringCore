package com.Main;

import java.util.Scanner;

public class EmployeeBean2 {
    private String companyCode;
    static{
        System.out.println("bean loading");
    }
    public EmployeeBean2(String companyCode){
          this.companyCode=companyCode;
          System.out.println("BEAN INSTANTIATION");
    }
    public void test(){
        System.out.println(companyCode);
    }
    public static EmployeeBean2 customObject(){
        EmployeeBean2 empbean2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key");
        int key = scanner.nextInt();
        if(key==1000){
            empbean2=new EmployeeBean2("QWERTY");
        }
        else{
            empbean2=new EmployeeBean2("PQRS");
        }
        return empbean2;
    }
    
   
}
