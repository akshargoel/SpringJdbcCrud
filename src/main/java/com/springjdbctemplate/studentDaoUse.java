package com.springjdbctemplate;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springentitieswithoutxml.Student;

//class implementing interface
public class studentDaoUse implements studentDao {
	private String query;
	
	//taking jdbctemplate as jt from jdbctemplate bean
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt= jt;
	}
	
	public JdbcTemplate getJt() {
		return jt;
	}
	
	@Override
	public void createTable() {
	        query = "CREATE TABLE IF NOT EXISTS students (" + "id INT PRIMARY KEY, " + "name VARCHAR(100), " +"state VARCHAR(100),"+"city VARCHAR(100),"+ "marks INT)" ;
	        this.jt.execute(query);
	}
	@Override
	public void insert(Student student) {
		// setting usecase of each
		//preparedStatement with ?????
		query= "insert into students (id , name, state, city, marks) values(?,?,?,?,?)";
		this.jt.update(query, student.getstudentId(), student.getstudentName(), student.getstudentState(), student.getstudentCity(), student.getstudentMarks());
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		query= "update students set name=?, state=?, city=?, marks=? where id=?";
		this.jt.update(query , student.getstudentName(), student.getstudentState(), student.getstudentCity(), student.getstudentMarks(), student.getstudentId());
	}

	@Override
	public void delete(int studentId) {
		query= "DELETE from students where id=?";
		this.jt.update(query,studentId);
	}

	@Override
	public Student getStudentDetail(int studentId) {
		query= "Select * from students where id=?";
		RowMapper<Student> rowmapper= new RowMapperUse();
		Student student= this.jt.queryForObject(query, rowmapper, studentId);
		return student;
	}
		
	@Override
	public List<Student> getAllStudentDetail(){
		query="Select * from students";
		List<Student> students= this.jt.query(query, new RowMapperUse());
		return students;
	}
	

}
