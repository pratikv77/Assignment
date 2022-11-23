package study.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="student_info_table")

public class Student implements Serializable{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="student_id")
	private int studentId;
		


	@Column(name="fname")
	private String studentFname;
	
	@Column(name="lname")
	private String studentLname;
	
	@Column(name="gender")
	private String studentGender;

	@Column(name="mobile_no")
	private String studentMobileNo;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFname() {
		return studentFname;
	}

	public void setStudentFname(String studentFname) {
		this.studentFname = studentFname;
	}

	public String getStudentLname() {
		return studentLname;
	}

	public void setStudentLname(String studentLname) {
		this.studentLname = studentLname;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(String studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFname=" + studentFname + ", studentLname=" + studentLname
				+ ", studentGender=" + studentGender + ", studentMobileNo=" + studentMobileNo + "]";
	}
	
	

}
