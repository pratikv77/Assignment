package study.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.dao.StudentDao;
import study.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao dao;
	
	
	@Override
	public Student saveStudent(Student student) {
		return dao.save(student);
	}
	
	@Override
	public Student getStudentbyId(Integer id) {
		Optional<Student> stud = dao.findById(id);
		if(stud.isPresent()) {
			return dao.findById(id).get();
		}
		throw new RuntimeException("Student is not found for id "+ id);		
	}

	@Override
	public void deleteStudent(Integer id) {
		dao.deleteById(id);;
		
	}

	@Override
	public Student updateStudent(Student student) {
		
		return dao.save(student);
	}

}
