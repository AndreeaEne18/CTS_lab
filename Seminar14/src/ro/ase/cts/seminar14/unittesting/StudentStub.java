package ro.ase.cts.seminar14.unittesting;

import ro.ase.cts.seminar14.StudentAbstract;
import ro.ase.cts.seminar14.StudentExcceptionWrongValue;

public class StudentStub extends StudentAbstract {

	float calculMedieReturnValue=0;
	boolean exceptionCase = false;
	
	public StudentStub() {
		super();
		this.calculMedieReturnValue = calculMedieReturnValue;
	}

	public void setCalculMedieReturnValue(float calculMedieReturnValue) {
		this.calculMedieReturnValue = calculMedieReturnValue;
	}
	
	public void setExceptionCase(boolean exceptionCase) {
		this.exceptionCase = exceptionCase;
	}

	@Override
	public float calculMedie() throws StudentExcceptionWrongValue {
		if(exceptionCase)
			throw new StudentExcceptionWrongValue(" exceptie calcul medie ");
		return calculMedieReturnValue;
		}
	
}
