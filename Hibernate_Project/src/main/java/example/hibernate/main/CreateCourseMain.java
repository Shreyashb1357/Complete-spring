package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Course;

public class CreateCourseMain {

	public static void main(String[] args) {
		Session sessionObj = null;
		SessionFactory factoryObj = null;
		try {
			//Configuring Hibernate
			Configuration conf = new Configuration();
			conf = conf.configure();
			//Obtaining SessionFactory
			factoryObj = conf.buildSessionFactory();
			//Obtaining Session
			sessionObj = factoryObj.openSession();
			//Obtaining Transaction
			Transaction tx = 
					sessionObj.beginTransaction();
			//Creating an entity class object
			Course courseObj = 
			new Course(101, "Mastering AWS", 80, 10500);
			//Storing course object into session
			sessionObj.persist(courseObj);
			//Committing the Transaction
			tx.commit();
			System.out.println("Course created successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			//Closing Session
			sessionObj.close();
			//Closing SessionFactory
			factoryObj.close();
		}
		

	}

}






