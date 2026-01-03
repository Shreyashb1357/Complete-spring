package example.hibernate.annotation.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.annotation.entity.Course;
import example.hibernate.annotation.utils.HibernateUtils;
//Show title and duration of courses
public class SelectClauseMain {

	public static void main(String[] args) {
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			String hqlQuery = 
			"select crs.title, crs.duration from Course crs";
			Query<Object[]> queryObj =
			sessionObj.createQuery(hqlQuery, Object[].class);
			List<Object[]> courseDetails = queryObj.getResultList();
			courseDetails.
			forEach(details -> 
			System.out.println(details[0] + " " + details[1]));
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}






