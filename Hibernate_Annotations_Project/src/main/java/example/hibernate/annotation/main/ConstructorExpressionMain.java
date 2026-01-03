package example.hibernate.annotation.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.annotation.bean.CourseTitleAndDuration;
import example.hibernate.annotation.entity.Course;
import example.hibernate.annotation.utils.HibernateUtils;
//Show title and duration of courses
public class ConstructorExpressionMain {

	public static void main(String[] args) {
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			String hqlQuery = """
					select new 
					example.hibernate.annotation.bean.CourseTitleAndDuration
					(crs.title, crs.duration) from Course crs
					""";
			Query<CourseTitleAndDuration> queryObj =
			sessionObj.createQuery(hqlQuery, CourseTitleAndDuration.class);
			List<CourseTitleAndDuration> data = 
			queryObj.getResultList();
			data.forEach(courseData -> System.out.println(courseData));			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}






