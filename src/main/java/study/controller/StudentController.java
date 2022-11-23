package study.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.entity.Student;
import study.service.StudentService;
import study.service.StudentServiceImpl;


@RestController
public class StudentController {
	
	
	private StudentService sService;
	
	//Create
	@PostMapping("/student/create")
	public Student createStudent(@RequestBody Student student ) {
		return sService.saveStudent(student);
	}
	
	//Read
	@GetMapping("/student/{id}")
	Student getStudent(@PathVariable Integer id) {
		return sService.getStudentbyId(id);
	}
	
	//Update
	@PutMapping("/student/{id}")
	Student updateStudent(@RequestBody Student student, @PathVariable Integer id) {
		student.setStudentId(id);
		return sService.updateStudent(student);
	}
	
	//Delete
	@DeleteMapping("/students")
	void deleteStudent(@RequestParam Integer id) {
		sService.deleteStudent(id);
	}
	
	
	
	
	

}
