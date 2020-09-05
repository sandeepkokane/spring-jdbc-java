package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.spring.jdbc.dao.ProductDao;
import com.spring.jdbc.dao.ProductDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc")
public class JdbcConfig {
	
	@Bean("dataSource")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test?createDatabaseIfNotExist=true");
		ds.setUsername("root");
		ds.setPassword("system");
		return  ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());		
		return jdbcTemplate;
	}
	
	@Bean("productDao")
	public ProductDao getProductDao()
	{
		ProductDao productDao = new ProductDaoImpl();
		
		return productDao;
	}
}
