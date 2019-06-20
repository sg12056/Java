package main.AppMain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import main.dbConfig.SpringJdbcConfig;
import main.restController.EmployeeController;
import main.restController.PaymentController;
import main.restController.jdbcController;

public class App {

    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
        jdbcController jb = (jdbcController) context.getBean("jdbcService");
        EmployeeController pm = (EmployeeController) context.getBean("empService");
        //pm.setupForm(Model);
        System.out.println();
        context.close();
    }   

   
}