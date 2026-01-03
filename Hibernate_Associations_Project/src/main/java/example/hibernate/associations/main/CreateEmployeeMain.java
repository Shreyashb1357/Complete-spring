package example.hibernate.associations.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Employee;
import example.hibernate.associations.utils.HibernateUtils;

public class CreateEmployeeMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory =
				HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			Employee employeeObj =
			new Employee(null, "James", 15000);
			Employee employeeObj2 =
			new Employee(null, "Jack", 25000);
			Employee employeeObj3 =
			new Employee(null, "Ana", 35000);
			Employee employeeObj4 =
			new Employee(null, "Nuria", 45000);
			Employee employeeObj5 =
			new Employee(null, "Thomas", 55000);
			
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(employeeObj);
			sessionObj.persist(employeeObj2);
			sessionObj.persist(employeeObj3);
			sessionObj.persist(employeeObj4);
			sessionObj.persist(employeeObj5);
			tx.commit();
			System.out.println("Employees created.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
