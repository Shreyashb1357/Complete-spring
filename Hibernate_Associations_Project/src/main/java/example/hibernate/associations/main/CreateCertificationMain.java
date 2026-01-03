package example.hibernate.associations.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Certification;
import example.hibernate.associations.utils.HibernateUtils;

public class CreateCertificationMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				) {
			Certification certObj = new Certification(null, "OCJP", null);
			Certification certObj2 = new Certification(null, "Scrum", null);
			Certification certObj3 = new Certification(null, "DevOps", null);
			
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(certObj);
			sessionObj.persist(certObj2);
			sessionObj.persist(certObj3);
			tx.commit();
			System.out.println("Certifications created");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
