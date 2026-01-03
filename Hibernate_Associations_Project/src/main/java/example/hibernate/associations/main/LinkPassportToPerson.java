package example.hibernate.associations.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.associations.entity.Passport;
import example.hibernate.associations.entity.Person;
import example.hibernate.associations.utils.HibernateUtils;

public class LinkPassportToPerson {

	public static void main(String[] args) {
		try( 
				SessionFactory factory =
				HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			//Fetch the passports
			String passportId = "351e5376-22da-428f-a3ce-e97386c50355";
			String passportId2 = "3d1af8de-e471-42c8-aa4a-707beacf0dc0";
			String passportId3 = "3788f39f-c882-46e4-aa7a-3cc21a7cd9a8";
			
			Passport passportObj=
			sessionObj.find(Passport.class, passportId);
			Passport passportObj2=
					sessionObj.find(Passport.class, passportId2);
			Passport passportObj3=
					sessionObj.find(Passport.class, passportId3);
			
			//Fetch the persons
			Person personObj = 
					sessionObj.find(Person.class, 1);
			Person personObj2 = 
					sessionObj.find(Person.class, 2);
			Person personObj3 = 
					sessionObj.find(Person.class, 3);
			
			Transaction tx = sessionObj.beginTransaction();
			personObj.setPassportDetails(passportObj);
			personObj2.setPassportDetails(passportObj2);
			personObj3.setPassportDetails(passportObj3);
			tx.commit();
			System.out.println("Passports are linked to persons");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}


