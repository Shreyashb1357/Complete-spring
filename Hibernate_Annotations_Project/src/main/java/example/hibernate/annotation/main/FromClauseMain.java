package example.hibernate.annotation.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.annotation.entity.Course;
import example.hibernate.annotation.utils.HibernateUtils;
//Show all courses
public class FromClauseMain {

	public static void main(String[] args) {
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			String hqlQuery = "from Course crs";
			Query<Course> queryObj = 
			sessionObj.createQuery(hqlQuery, Course.class);
			List<Course> courseList = queryObj.getResultList();
			//for(Course currentCourse : courseList)
				//System.out.println(currentCourse);
			courseList.forEach(course -> System.out.println(course.getTitle()));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}






