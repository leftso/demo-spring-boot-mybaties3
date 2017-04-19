package com.leftso.config;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybaties配置扫描mapper路径
 * 
 * @author leftso
 *
 */
@Configuration
@MapperScan(basePackages = { "com.leftso.mapper" }) /** 注意,这个注解是扫描mapper接口不是xml文件,使用xml模式必须在配置文件中添加xml的配置 **/
@EnableTransactionManagement /** 启用事物管理 ,在需要事物管理的service类或者方法上使用注解@Transactional**/
public class MyBatiesConfig {
	@Autowired
	private DataSource dataSource;

	/**
	 * 配合注解完成事物管理
	 * 
	 * @return
	 */
	@Bean
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
}
