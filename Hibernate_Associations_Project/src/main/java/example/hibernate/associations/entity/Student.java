package example.hibernate.associations.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
//This is the OWNING side
@Entity
@Table(name = "Student_Master")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer studentId;
	@Column(name = "student_name", length = 30)
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "Student_With_Certification",
			joinColumns = {@JoinColumn(name = "student_id")},//Foreign Key column referring to the primary key of OWNING side table
			inverseJoinColumns = {@JoinColumn(name = "certification_id")}//Foreign Key column referring to the primary key of INVERSE side table
	)	
	private List<Certification> certifications;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentId, String name, List<Certification> certifications) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.certifications = certifications;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Certification> getCertifications() {
		return certifications;
	}
	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
		//Setting other end of the association
		for(Certification currentCertification : certifications) {
			currentCertification.addStudent(this);
		}
	}
	public void addCertification(Certification certification) {
		certifications.add(certification);
		//Setting other end of the association
		certification.addStudent(this);
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", certifications=" + certifications + "]";
	}

}
