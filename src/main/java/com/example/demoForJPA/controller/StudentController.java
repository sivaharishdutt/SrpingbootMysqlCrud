package com.example.demoForJPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoForJPA.entity.Student;
import com.example.demoForJPA.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepo;
	
	@PostMapping("api/students")
	public ResponseEntity<Student> saveStudent(@RequestBody Student request)
	{
		 
		return new ResponseEntity<>(studentRepo.save(request), HttpStatus.CREATED);
	}
	
	@GetMapping("api/students")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		return new ResponseEntity<>(studentRepo.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("api/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable long id)
	{
		Optional<Student> result = studentRepo.findById(id);
		if(result.isEmpty())
		{
			return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Student>(result.get(), HttpStatus.OK);
	}
	
	@PutMapping("api/students/{id}")
	public ResponseEntity<Student> updateStudentById(@PathVariable long id, @RequestBody Student request)
	{
		Optional<Student> updateStudent = studentRepo.findById(id);
		if(updateStudent.isEmpty())
		{
			return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
		}
		updateStudent.get().setStudentName(request.getStudentName());
		updateStudent.get().setStudentGrade(request.getStudentGrade());
		updateStudent.get().setStudentAge(request.getStudentAge());
		updateStudent.get().setStudentEmail(request.getStudentEmail());
		
		return new ResponseEntity<Student>(studentRepo.save(updateStudent.get()), HttpStatus.OK);
	}
	
	@DeleteMapping("api/students/{id}")
	public ResponseEntity<Void> deleteStudentById(@PathVariable long id)
	{
		Optional<Student> result = studentRepo.findById(id);
		if(result.isEmpty())
		{
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		studentRepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
