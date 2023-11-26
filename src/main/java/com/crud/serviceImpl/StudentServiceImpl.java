package com.crud.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Student;
import com.crud.exception.StudentNotFoundException;
import com.crud.repository.StudentRepository;
import com.crud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student update(Long id, Student updateStudent) {
		Optional<Student> studentId = studentRepository.findById(id);
		if (studentId.isPresent()) {
			Student existedStudent = studentId.get();
			existedStudent.setName(updateStudent.getName());
			existedStudent.setSalary(updateStudent.getSalary());
			existedStudent.setDob(updateStudent.getDob());
			return studentRepository.save(existedStudent);
		} else {
			throw new StudentNotFoundException("Student Not Found Exception");
		}

	}

	@Override
	public void delete(Long id) {
		Optional<Student> findById = studentRepository.findById(id);
		if (findById.isPresent()) {
			studentRepository.deleteById(id);
		} else {
			throw new StudentNotFoundException(id, "Student not found with id: " + id);
		}
	}

	@Override
	public void deleteAll() {
		studentRepository.deleteAll();
	}

}
