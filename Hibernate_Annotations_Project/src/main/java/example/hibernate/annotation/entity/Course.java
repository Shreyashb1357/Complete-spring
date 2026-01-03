package example.hibernate.annotation.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity//Marks this class as an entity
@Table(name = "Course_Details")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private Integer courseId;
	@Column(name = "course_title", length = 50)
	private String title;
	@Column(name = "course_duration")
	private int duration;
	@Column(name = "course_fees")
	private int fees;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(Integer courseId, String title, int duration, int fees) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.duration = duration;
		this.fees = fees;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", duration=" + duration + ", fees=" + fees + "]";
	}

}
