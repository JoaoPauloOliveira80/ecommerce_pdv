package com.joaopaulo.ecommerce_full.ecommerce_full;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class ECommerceFullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceFullApplication.class, args);
	}

	@Bean
	public DataSource dataSource(){
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/db_fanaticos");
	    dataSource.setUsername("root");
	    dataSource.setPassword("vertrigo");
	    return dataSource;
	}
}
