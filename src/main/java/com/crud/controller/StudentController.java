package com.crud.controller;

import java.util.List;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student savedStudent = studentService.save(student);
//		return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
		return ResponseEntity.ok(savedStudent);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAll() {
		return ResponseEntity.ok(studentService.getAllStudents());
	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<Student> getById(@PathVariable Long id) {
		return ResponseEntity.ok(studentService.getStudentById(id));
	}

	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAll() {
		studentService.deleteAll();
		return ResponseEntity.ok("Deleted All Data");
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
		studentService.delete(id);
		return ResponseEntity.ok("Delete successfully");
	}

	@PutMapping("update/{id}")
	public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
		return ResponseEntity.ok(studentService.update(id, student));
	}

}
