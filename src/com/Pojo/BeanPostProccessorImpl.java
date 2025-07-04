package com.Pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class BeanPostProccessorImpl implements BeanPostProcessor{

    @Override
    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
          if(bean instanceof Controller){
            System.out.println("controller created done");
        }
        else if (bean instanceof Service){
             System.out.println("Service created done");
        }
        else{
            Dow dao =(Dow)bean;
            String init = dao.init();
            if(init.equals("connection is good")){
                System.out.println("dow created done");
            }

            else{
                System.out.println("not connected");
            }
        }
        return bean;
    }

    @Override
    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Controller){
            System.out.println("controller instatiation with id"+beanName);
        }
        else if (bean instanceof Service){
             System.out.println("Service instatiation with id"+beanName);
        }
        else{
            System.out.println("Dao instatiation with id"+beanName);
        }
        return bean;
    }
    

}
