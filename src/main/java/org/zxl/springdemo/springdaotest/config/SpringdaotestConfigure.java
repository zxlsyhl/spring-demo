package org.zxl.springdemo.springdaotest.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

//@Configuration
//@ComponentScan(basePackages = "zxl.com.springdaotest")
public class SpringdaotestConfigure {

//    @Bean
//    public BasicDataSource dataSource(){
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://192.168.1.102:3306/demo_db");
//        dataSource.setUsername("sleuth");
//        dataSource.setPassword("Sleuth0901!");
//        return dataSource;
//    }

//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public JdbcTemplate jdbcTemplate(){
//        return new JdbcTemplate(dataSource);
//    }
}
