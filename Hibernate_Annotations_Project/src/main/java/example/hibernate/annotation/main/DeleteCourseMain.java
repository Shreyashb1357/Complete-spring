package example.hibernate.annotation.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.entity.Course;
import example.hibernate.annotation.utils.HibernateUtils;

public class DeleteCourseMain {

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
				sessionObj.remove(foundCourse);
				tx.commit();
				System.out.println("Course Delete completed.");
			}
			else
				System.out.println("Course with given ID does not exist.");
				
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}
	

}
