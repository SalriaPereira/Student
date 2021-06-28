package student.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="StudentMarks")
	
public class StudentMarks {
	
	@Id @GeneratedValue
	@GenericGenerator(name ="newGenerator", strategy = "foreign", parameters={ @Parameter (value = "student", name = "property") })
	private int rollNo;
	
	private String course1;
	private String course2;
	private String course3;
	private String course4;
	private String course5;
	private String course6;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rollNo")
	private Student_info student;
	

	public Student_info getStudent() {
		return student;
	}

	public void setStudent(Student_info student) {
		this.student = student;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCourse1() {
		return course1;
	}

	public void setCourse1(String course1) {
		this.course1 = course1;
	}

	public String getCourse2() {
		return course2;
	}

	public void setCourse2(String course2) {
		this.course2 = course2;
	}

	public String getCourse3() {
		return course3;
	}

	public void setCourse3(String course3) {
		this.course3 = course3;
	}

	public String getCourse4() {
		return course4;
	}

	public void setCourse4(String course4) {
		this.course4 = course4;
	}

	public String getCourse5() {
		return course5;
	}

	public void setCourse5(String course5) {
		this.course5 = course5;
	}

	public String getCourse6() {
		return course6;
	}

	public void setCourse6(String course6) {
		this.course6 = course6;
	}

	
	
}
