package com.crud.service;

import java.util.List;

import com.crud.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student getStudentById(Long id);

	public Student save(Student student);

	public Student update(Long id, Student updateStudent);

	public void delete(Long id);
	
	public void deleteAll();
}
