package example.hibernate.annotation.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.entity.Course;
import example.hibernate.annotation.utils.HibernateUtils;

public class UpdateCourseMain {

	public static void main(String[] args) {
		try (
				SessionFactory factory = 
				HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			Course foundCourse = 
			sessionObj.find(Course.class, 3);
			if(foundCourse != null) {
				Transaction tx = sessionObj.beginTransaction();
				foundCourse.setTitle("Hibernate in Action");
				foundCourse.setFees(12000);
				tx.commit();
				System.out.println("Course Update completed.");
			}
			else
				System.out.println("Course with given ID does not exist.");
				
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
