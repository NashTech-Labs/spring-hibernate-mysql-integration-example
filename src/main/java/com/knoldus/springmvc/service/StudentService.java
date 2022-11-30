package com.knoldus.springmvc.service;

import com.knoldus.springmvc.model.Student;
import java.util.List;

public interface StudentService {

	Student findById(int id);
	
	void saveStudent(Student student);
	
	void updateStudent(Student student);
	
	void deleteStudentByCode(String code);

	List<Student> findAllStudents(); 
	
	Student findStudentByCode(String code);

	boolean isStudentCodeUnique(Integer id, String code);
	
}
