package study.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import study.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
