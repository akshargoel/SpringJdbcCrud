package com.springjdbcwithoutXml;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springentitieswithoutxml.Student;
import com.springjdbctemplate.studentDaoUse;

//Configuration without xml
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new AnnotationConfigApplicationContext(jdbcConfig.class);
    	
    	studentDaoUse stdu = (studentDaoUse) context.getBean("stdu");
    	Student student= new Student();
    	student.setstudentId(1);
    	student.setstudentName("Akshar");
    	student.setstudentState("Delhi");
    	student.setstudentCity("New Delhi");
    	student.setstudentMarks(98);
	
    	Student student1= new Student();
    	student1.setstudentId(2);
    	student1.setstudentName("Kriti");
    	student1.setstudentState("Delhi");
    	student1.setstudentCity("New Delhi");
    	student1.setstudentMarks(58);
    	
    	Student studentupdate= new Student();
    	studentupdate.setstudentId(2);
    	studentupdate.setstudentName("Kriti");
    	studentupdate.setstudentState("UP");
    	studentupdate.setstudentCity("Lucknow");
    	studentupdate.setstudentMarks(48);
    	
    	
//    	to create table
//    	stdu.createTable();
    	
//    	to insert()
//    	stdu.insert(student);
//    	stdu.insert(student1);
    	
//    	query to update()
//    	stdu.update(studentupdate);
    	
    	
//    	query to delete
//    	stdu.delete(2);
    	
    	
//    	query to fetch student
//    	Student studentfetch= stdu.getStudentDetail(1);
//    	System.out.println(studentfetch);
    	
    	
//    	fetch all students
//    	List <Student> allStudent= stdu.getAllStudentDetail();
//    	for(Student students : allStudent) {
//    		System.out.println(students);
//    	}
    }
}
