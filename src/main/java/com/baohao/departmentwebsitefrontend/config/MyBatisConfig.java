package com.baohao.departmentwebsitefrontend.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zwzx.common.spring.PropertiesConfigurer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@MapperScan(basePackages = "com.baohao.departmentwebsitefrontend.dao", sqlSessionFactoryRef = "sqlSessionFactory")
public class MyBatisConfig {
    @Bean
    @Primary
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(PropertiesConfigurer.getProperty("rdb.driver"));
        comboPooledDataSource.setJdbcUrl(PropertiesConfigurer.getProperty("rdb.url"));
        comboPooledDataSource.setUser(PropertiesConfigurer.getProperty("rdb.user"));
        comboPooledDataSource.setPassword(PropertiesConfigurer.getProperty("rdb.password"));
        return comboPooledDataSource;
    }
}
