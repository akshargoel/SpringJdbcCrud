package com.springjdbctemplate;

import java.util.List;

import com.springentitieswithoutxml.Student;

//interface telling functions
public interface studentDao {
	
	public void createTable();
	//to insert something
	public void insert(Student studentId);
	
	//to update table
	public void update(Student studentId);
	
	// to delete table
	public void delete(int studentId);
	
	//fetch student object
	public Student getStudentDetail (int studentId);
	
	//fetch all student object
	public List<Student> getAllStudentDetail();
	
}
