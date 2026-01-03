package example.hibernate.annotation.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.annotation.entity.Course;
import example.hibernate.annotation.utils.HibernateUtils;

public class RetrieveCourseMain {

	public static void main(String[] args) {
		try (
				SessionFactory factory = 
				HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			//Finding a single course against its ID
			
			//Class<Course> courseType = Course.class;
			//Object ID = 3;//new Integer(1);=> Auto Boxing
			Course foundCourse = 
			sessionObj.find(Course.class, 3);
			if(foundCourse != null)
				System.out.println(foundCourse);
			else
				System.out.println("Course with given ID does not exist.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}



