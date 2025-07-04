package com.Pojo;

import javax.annotation.PostConstruct;

public class Dow {
    private String connection;
    @PostConstruct
    public String init(){
        String connection = "connection is good";
        this.connection=connection;
        return connection;

    }
        public void test1(){
        System.out.println("dao 1 called");
        System.out.println(connection);
    }
    public void test2(){
        System.out.println("dao 2 called");
    }

}
