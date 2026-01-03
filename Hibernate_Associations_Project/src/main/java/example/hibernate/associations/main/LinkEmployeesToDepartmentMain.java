package example.hibernate.associations.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import example.hibernate.associations.entity.Department;
import example.hibernate.associations.entity.Employee;
import example.hibernate.associations.utils.HibernateUtils;

public class LinkEmployeesToDepartmentMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory =
				HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			//Fetch the employees
			Employee emp = 
			sessionObj.find(Employee.class, 1);
			Employee emp2 =
			sessionObj.find(Employee.class, 2);
			Employee emp3 =
			sessionObj.find(Employee.class, 3);
			Employee emp4 =
			sessionObj.find(Employee.class, 4);
			Employee emp5 =
			sessionObj.find(Employee.class, 5);
			//Fetch the departments
			Department dept = 
			sessionObj.find(Department.class, 1);
			Department dept2 =
			sessionObj.find(Department.class, 2);
			//Link employees to departments
			Transaction tx = sessionObj.beginTransaction();
			//Creating a list of employees 1,2 and 4
			List<Employee> itEmployees =
					new ArrayList<>();
			itEmployees.add(emp);
			itEmployees.add(emp2);
			itEmployees.add(emp4);
			//Adding these employees to 1st Dept
			dept.setEmployees(itEmployees);
			//Adding employees 3 and 5 to 2nd Dept
			dept2.addEmployee(emp3);
			dept2.addEmployee(emp5);
			tx.commit();
			System.out.println("Employees are linked to departments");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
