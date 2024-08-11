package com.springjdbcwithoutXml;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springentitieswithoutxml.Student;
import com.springjdbctemplate.studentDaoUse;

@Configuration
public class jdbcConfig {
	
	@Bean(name= {"ds"})
	public DataSource getDataSource() {
		//Datasource is interface which needs class with methods implementing
		DriverManagerDataSource drama= new DriverManagerDataSource();
		drama.setDriverClassName(" com.mysql.cj.jdbc.Driver");
		drama.setUrl("jdbc:mysql://localhost:3306/springjdbcwithoutxml");
		drama.setUsername("root");
		drama.setPassword("root");
		return drama;
	}
	
	@Bean(name= {"jt", "jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate(DataSource ds) {
		JdbcTemplate jt= new JdbcTemplate();
		jt.setDataSource(ds);
		return jt;
	}
	
	@Bean(name= {"stdu"})
	public studentDaoUse studentdaouse(JdbcTemplate jt) {
		studentDaoUse stdu= new studentDaoUse();
		stdu.setJt(jt);
		return stdu;
	}
}
