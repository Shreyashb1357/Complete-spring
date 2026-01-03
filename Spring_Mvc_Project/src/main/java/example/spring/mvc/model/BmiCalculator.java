package example.spring.mvc.model;

public class BmiCalculator {
	public static float getBmi(float htInCm, float wt) {
		//BMI: Wt in Kg / (Ht in Mtr)sq
		float htInMtr = htInCm / 100.0f;
		float bmi = wt / (htInMtr * htInMtr);
		return bmi;
	}
}
