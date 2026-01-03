package example.hibernate.associations.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Passport;
import example.hibernate.associations.utils.HibernateUtils;

public class CreatePassportMain {

	public static void main(String[] args) {
		try( 
				SessionFactory factory =
				HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			LocalDate expDate = 
			LocalDate.now().plus(3, ChronoUnit.YEARS);
			LocalDate expDate2 = 
			LocalDate.now().plus(4, ChronoUnit.YEARS);
			LocalDate expDate3 = 
			LocalDate.now().plus(7, ChronoUnit.YEARS);
			
			Passport passportObj =
			new Passport(null, "Amit", expDate);
			Passport passportObj2 =
			new Passport(null, "Saket", expDate2);
			Passport passportObj3 =
			new Passport(null, "Neha", expDate3);
			
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(passportObj);
			sessionObj.persist(passportObj2);
			sessionObj.persist(passportObj3);
			tx.commit();
			System.out.println("Passports created.");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
