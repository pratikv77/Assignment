package study.service;

import study.entity.Student;

public interface StudentService {
	public Student saveStudent(Student student);

	Student getStudentbyId(Integer id);
	
	void deleteStudent(Integer id);
	
	Student updateStudent(Student student);
}
