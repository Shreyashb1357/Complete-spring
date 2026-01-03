package example.hibernate.associations.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.associations.entity.Certification;
import example.hibernate.associations.entity.Department;
import example.hibernate.associations.entity.Employee;
import example.hibernate.associations.entity.Passport;
import example.hibernate.associations.entity.Person;
import example.hibernate.associations.entity.Student;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		conf.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		conf.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/associations");
		conf.setProperty("hibernate.connection.username", "root");
		conf.setProperty("hibernate.connection.password", "root");
		conf.setProperty("hibernate.hbm2ddl.auto", "update");
		conf.setProperty("hibernate.show_sql", "true");
		conf.addAnnotatedClasses(
				Person.class, 
				Passport.class,
				Department.class,
				Employee.class,
				Student.class,
				Certification.class
		);
		SessionFactory factory = conf.buildSessionFactory();
		return factory;
	}

}







