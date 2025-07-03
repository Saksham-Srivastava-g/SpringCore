package com.Pojo;

public class Service {
    private Dow dao;
     public void test1(){
        System.out.println("service 1 called");
        dao.test1();
    }

        public void test2(){
        System.out.println("service 2 called");
        dao.test2();
    }
        public void setDao(Dow dao) {
            this.dao = dao;
        }
}
