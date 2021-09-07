package com.dannykudinov.spring.rest;

import com.dannykudinov.spring.rest.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);
//        Employee emp = new Employee("Denis", "Kudinov", "IT", 350);
//        emp.setId(4);
//        communication.saveEmployee(emp);
        communication.deleteEmployee(3);
    }
}
