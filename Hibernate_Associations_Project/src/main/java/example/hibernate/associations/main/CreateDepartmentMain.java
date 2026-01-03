package example.hibernate.associations.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Department;
import example.hibernate.associations.utils.HibernateUtils;

public class CreateDepartmentMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory =
				HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			Department deptObj =
			new Department(null, "IT", null);
			Department deptObj2 =
			new Department(null, "HR", null);
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(deptObj);
			sessionObj.persist(deptObj2);
			tx.commit();
			System.out.println("Departments created.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
