package example.hibernate.annotation.bean;

public class CourseTitleAndDuration {
	private String courseTitle;
	private int courseDuration;
	public CourseTitleAndDuration() {
		// TODO Auto-generated constructor stub
	}
	public CourseTitleAndDuration(String courseTitle, int courseDuration) {
		super();
		this.courseTitle = courseTitle;
		this.courseDuration = courseDuration;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	@Override
	public String toString() {
		return "CourseTitleAndDuration [courseTitle=" + courseTitle + ", courseDuration=" + courseDuration + "]";
	}

}
