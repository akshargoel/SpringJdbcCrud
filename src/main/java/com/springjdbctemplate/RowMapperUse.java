package com.springjdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springentitieswithoutxml.Student;

public class RowMapperUse implements RowMapper<Student> {

	
	//maprow maps all the row from database to obj
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std= new Student();
		std.setstudentId(rs.getInt(1));
		std.setstudentName(rs.getString(2));
		std.setstudentState(rs.getString(3));
		std.setstudentCity(rs.getString(4));
		std.setstudentMarks(rs.getInt(5));
		return std;
	}

}
