package com.example;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:context.xml")
public class AppConfig {

	@Bean
	public XmlBean xmlBean() {
		XmlBean xmlBean = new XmlBean();
		xmlBean.setP1(3);
		xmlBean.setP2("Some value");
		xmlBean.setDataSource(dataSource());
		return xmlBean;
	}
	
	@Bean
	public AnnotationBean annotationBean() {
		AnnotationBean annotationBean = new AnnotationBean();
		annotationBean.setP1(99);
		annotationBean.setP2("Name");
		annotationBean.setDataSource(dataSource());
		return annotationBean;
	}

	
	//根据方法名 获取 bean 的id
	@Bean(destroyMethod = "close")
	DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.mariadb.jdbc.Driver");
		ds.setUsername("app");
		ds.setPassword("app");
		ds.setUrl("jdbc:mariadb://localhost:3306/app");
		return ds;
	}

}
