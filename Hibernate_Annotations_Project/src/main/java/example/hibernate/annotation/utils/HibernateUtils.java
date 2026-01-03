package example.hibernate.annotation.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.annotation.entity.Course;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		conf.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		conf.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/udemy");
		conf.setProperty("hibernate.connection.username", "root");
		conf.setProperty("hibernate.connection.password", "root");
		conf.setProperty("hibernate.hbm2ddl.auto", "update");
		conf.setProperty("hibernate.show_sql", "true");
		//Class<Course> courseType = Course.class;
		conf.addAnnotatedClass(Course.class);
		SessionFactory factory = conf.buildSessionFactory();
		return factory;
	}

}
