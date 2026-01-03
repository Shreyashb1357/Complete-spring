package example.hibernate.associations.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Certification;
import example.hibernate.associations.entity.Student;
import example.hibernate.associations.utils.HibernateUtils;

public class LinkCertificationsToStudentsMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				) {
			//Fetch the students who have done certification
			Student james =
			sessionObj.find(Student.class, 1);
			Student gavin =
			sessionObj.find(Student.class, 3);
			//Fetch the certifications which have been done by some student
			Certification ocjp =
			sessionObj.find(Certification.class, 1);
			Certification scrum =
			sessionObj.find(Certification.class, 2);
			
			Transaction tx = sessionObj.beginTransaction();
			james.addCertification(ocjp);
			james.addCertification(scrum);
			gavin.addCertification(ocjp);
			tx.commit();
			System.out.println("Certifications are linked to Students");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}







