package example.hibernate.associations.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Person;
import example.hibernate.associations.utils.HibernateUtils;

public class CreatePersonMain {
	public static void main(String[] args) {
		try( 
				SessionFactory factory =
				HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			Person personObj =
			new Person(null,"Amit","amit@gmail.com",null);
			Person personObj2 =
					new Person(null,"Saket","saket@gmail.com",null);
			Person personObj3 =
					new Person(null,"Neha","neha@gmail.com",null);
			
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(personObj);
			sessionObj.persist(personObj2);
			sessionObj.persist(personObj3);
			tx.commit();
			System.out.println("Persons created.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}
}
