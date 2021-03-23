package com.github.bilakpoc.springjdbcissues.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.relational.core.mapping.NamingStrategy;

@Configuration
public class JdbcConfig {
  
  @Bean
  NamingStrategy namingStrategy(){
    return NamingStrategy.INSTANCE;
  }
}
