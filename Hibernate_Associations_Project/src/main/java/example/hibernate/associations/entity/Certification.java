package example.hibernate.associations.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
//This is the INVERSE side
@Entity
@Table(name = "Certification_Master")
public class Certification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "certification_id")
	private Integer certificationId;
	@Column(name = "certification_name", length = 30)
	private String name;
	@ManyToMany(
			cascade = CascadeType.ALL,
			mappedBy = "certifications"
			)//Making this side as INVERSE side
	private List<Student> students;
	public Certification() {
		// TODO Auto-generated constructor stub
	}
	public Certification(Integer certificationId, String name, List<Student> students) {
		super();
		this.certificationId = certificationId;
		this.name = name;
		this.students = students;
	}
	public Integer getCertificationId() {
		return certificationId;
	}
	public void setCertificationId(Integer certificationId) {
		this.certificationId = certificationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	@Override
	public String toString() {
		return "Certification [certificationId=" + certificationId + ", name=" + name + ", students=" + students + "]";
	}

}
