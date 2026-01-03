package example.hibernate.associations.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Student;
import example.hibernate.associations.utils.HibernateUtils;

public class CreateStudentMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				) {
			Student studentObj = new Student(null, "James", null);
			Student studentObj2 = new Student(null, "Jack", null);
			Student studentObj3 = new Student(null, "Gavin", null);
			
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(studentObj);
			sessionObj.persist(studentObj2);
			sessionObj.persist(studentObj3);
			tx.commit();
			System.out.println("Students created");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
