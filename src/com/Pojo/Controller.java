package com.Pojo;

public class Controller {
    private Service service;
    public String usrername;
    public void doPost(){
            System.out.println("controller in dopost");
            service.test1();
    }
    
    public void setService(Service service) {
        this.service = service;
    }

    public void setUsrername(String usrername) {
        this.usrername = usrername;
    }

    public void doGet(){
        System.out.println("controller in doget");
        service.test2();
    }
}
