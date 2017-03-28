package com.leftso.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybaties配置扫描mapper路径
 * 
 * @author leftso
 *
 */
@Configuration
@MapperScan(basePackages = { "com.leftso.mapper" }) /** 注意,这个注解是扫描mapper接口不是xml文件,使用xml模式必须在配置文件中添加xml的配置 **/
public class MyBatiesConfig {

}
