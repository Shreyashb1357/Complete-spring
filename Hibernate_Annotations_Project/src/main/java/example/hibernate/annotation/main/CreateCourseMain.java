package example.hibernate.annotation.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.entity.Course;
import example.hibernate.annotation.utils.HibernateUtils;

public class CreateCourseMain {

	public static void main(String[] args) {
		try (
				SessionFactory factory = 
				HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			Course courseObj = 
			new Course(null, "DevOps Fundamentals", 30, 16500);
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(courseObj);
			tx.commit();
			System.out.println("Course created successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
