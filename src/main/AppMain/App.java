package main.AppMain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import main.dbConfig.SpringJdbcConfig;
import main.restController.jdbcController;

public class App {
    
    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
        jdbcController jb = (jdbcController) context.getBean("jdbcService");
        //jb.query();
        System.out.println(jb.query());
        context.close();
    }   

   
}