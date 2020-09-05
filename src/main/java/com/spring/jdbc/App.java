package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Spring JDBC Project using JAVA BASED CONFIGURATION Performing -> CRUD Operations ");
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    	
    	
    	
    }
}
